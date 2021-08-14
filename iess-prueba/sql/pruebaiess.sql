--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2021-08-14 12:41:30 -05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12623)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2374 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 182 (class 1259 OID 140774)
-- Name: Cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "Cliente" (
    "idCliente" integer NOT NULL,
    nombre character varying(255) NOT NULL,
    "correoElectronico" character varying(255) NOT NULL,
    "numeroTelefonico" character varying(255) NOT NULL,
    estado character varying(255)
);
ALTER TABLE ONLY "Cliente" ALTER COLUMN "idCliente" SET STATISTICS 1;


ALTER TABLE "Cliente" OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 140763)
-- Name: cliente_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE cliente_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE cliente_id_seq OWNER TO postgres;

--
-- TOC entry 2375 (class 0 OID 0)
-- Dependencies: 181
-- Name: cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE cliente_id_seq OWNED BY "Cliente"."idCliente";


--
-- TOC entry 2248 (class 2604 OID 140783)
-- Name: idCliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Cliente" ALTER COLUMN "idCliente" SET DEFAULT nextval('cliente_id_seq'::regclass);


--
-- TOC entry 2366 (class 0 OID 140774)
-- Dependencies: 182
-- Data for Name: Cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY "Cliente" ("idCliente", nombre, "correoElectronico", "numeroTelefonico", estado) FROM stdin;
25	111	xxxxx	bbbbb	A
24	1111	000	aa	I
26	eee	ee	ee	A
27	ss	ss	ss	A
\.


--
-- TOC entry 2376 (class 0 OID 0)
-- Dependencies: 181
-- Name: cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('cliente_id_seq', 27, true);


--
-- TOC entry 2250 (class 2606 OID 140782)
-- Name: Cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Cliente"
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY ("idCliente");


--
-- TOC entry 2373 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2021-08-14 12:41:30 -05

--
-- PostgreSQL database dump complete
--

