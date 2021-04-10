CREATE TABLE anillas (
  codigo_anilla integer PRIMARY KEY AUTOINCREMENT,
  tipo_anilla char(10) NOT NULL DEFAULT '',
  diametro double NOT NULL DEFAULT '0',
  cant_minima integer zerofill DEFAULT '0000000000',
  tipo_impresion char(10) DEFAULT NULL,
  precio double  zerofill DEFAULT '0000000000000000000000',
  codigo_diametro char(2) NOT NULL,
  fecha_baja date DEFAULT '9999-12-31',
  ind_baja tinyint(1) DEFAULT NULL,
  numero_articulo integer DEFAULT '0',
  codigo_fabricante integer NOT NULL,
  peso double DEFAULT NULL,
  precio_compra double DEFAULT NULL
); 
CREATE TABLE `ano_contable` (
  `ano` integer PRIMARY KEY AUTOINCREMENT,
  `ultimo_pedido` integer  NOT NULL DEFAULT '0',
  `ind_activo` tinyint(1) NOT NULL
);
CREATE TABLE `bic` (
  `num_sec` integer  PRIMARY KEY DEFAULT '0',
  `nrbe` integer  NOT NULL DEFAULT '0',
  `bic` varchar(11) DEFAULT NULL,
  `denominacion` varchar(100) DEFAULT NULL
);
CREATE TABLE `criadores` (
  `numero_criador` integer PRIMARY KEY AUTOINCREMENT,
  `codigo_criador` char(7) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apel1` varchar(45) DEFAULT NULL,
  `apel2` varchar(45) DEFAULT NULL,
  `cif_nif` char(20) DEFAULT NULL,
  `otros` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codigo_postal` char(20) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `telefono_movil` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `cuenta` char(20) DEFAULT NULL,
  `tarjeta` char(20) DEFAULT NULL,
  `exptarj` char(5) DEFAULT NULL,
  `pago` char(2) DEFAULT NULL,
  `fecha_pago` date DEFAULT NULL,
  `carnet` date DEFAULT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `marca_baja` tinyint(1) DEFAULT NULL,
  `fecha_baja` date DEFAULT NULL,
  `motivo_baja` varchar(150) DEFAULT NULL,
  `profesion` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `cvv` varchar(10) DEFAULT NULL,
  `codigo_usuario` varchar(20) DEFAULT NULL,
  `ind_vip` tinyint(1) DEFAULT NULL,
  `iban` varchar(35) DEFAULT NULL,
  `bic` varchar(11) DEFAULT NULL,
  `feccad_carnet` date DEFAULT NULL
);
CREATE TABLE `cuotas_criadores` (
  `numero_cuota` integer PRIMARY KEY AUTOINCREMENT,
  `numero_criador` integer  NOT NULL,
  `codigo_criador` char(7) NOT NULL,
  `fecha_pago` date DEFAULT NULL,
  `importe` double  DEFAULT NULL,
  `forma_pago` char(2) DEFAULT NULL,
  `ano` integer  DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `ind_pagado` tinyint(1)  DEFAULT NULL,
  `ind_devolucion` tinyint(1)  DEFAULT NULL,
  `ind_q19` tinyint(1)  DEFAULT NULL,
  `fecha_q19` date DEFAULT NULL
);
CREATE TABLE `datos_fijos` (
  `num_sec` integer PRIMARY KEY DEFAULT '0',
  `nombre_empresa` varchar(45) DEFAULT NULL,
  `responsable` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `CIF` char(9) DEFAULT NULL,
  `CCC` varchar(20) DEFAULT NULL,
  `servidor_correo_saliente` varchar(45) DEFAULT NULL,
  `cuenta_correo_saliente` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `codigo_postal` varchar(45) DEFAULT NULL,
  `dias_carencia_nuevas_altas` integer  DEFAULT NULL,
  `dia_cobro_cuotas` char(2) DEFAULT NULL,
  `mes_cobro_cuotas` char(2) DEFAULT NULL,
  `iban` varchar(35) DEFAULT NULL,
  `bic` varchar(11) DEFAULT NULL
);
CREATE TABLE `detalle_facturas` (
  `num_linea_fac` integer PRIMARY KEY AUTOINCREMENT,
  `num_sec` integer  NOT NULL,
  `numero_pedido` char(7) DEFAULT NULL,
  `concepto` varchar(45) DEFAULT NULL,
  `importe` double  DEFAULT '0',
  `tipo_iva` double  DEFAULT '0',
  `cantidad` integer  DEFAULT NULL
);
CREATE TABLE `detalle_pedidos` (
  `num_linea` integer PRIMARY KEY AUTOINCREMENT,
  `num_sec` integer  NOT NULL,
  `codigo_anilla` integer  NOT NULL DEFAULT '0',
  `cantidad` integer  DEFAULT NULL,
  `numero_certif` varchar(45) DEFAULT NULL,
  `especie` varchar(45) DEFAULT NULL,
  `importe` double  DEFAULT '0',
  `marca_especial` varchar(10) DEFAULT NULL
);
CREATE TABLE `fabricantes` (
  `codigo_fabricante` integer PRIMARY KEY AUTOINCREMENT,
  `nombre` varchar(45) NOT NULL DEFAULT '',
  `direccion` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `codigo_postal` char(20) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `idioma` varchar(45) DEFAULT NULL,
  `tipo_de_envio` varchar(10) DEFAULT NULL
);
CREATE TABLE `facturas` (
  `num_sec` integer PRIMARY KEY AUTOINCREMENT,
  `numero_factura` char(7) NOT NULL,
  `fecha_emision` date NOT NULL DEFAULT '0001-01-01',
  `numero_criador` integer  NOT NULL,
  `fecha_pago` date DEFAULT NULL,
  `importe` double  DEFAULT NULL,
  `iva` double  DEFAULT NULL,
  `gastos` double  DEFAULT NULL,
  `tipo_pago` varchar(100) DEFAULT NULL,
  `comentario` varchar(350) DEFAULT NULL,
  `ind_devolucion` tinyint(1)  DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `ind_pagado` tinyint(1)  DEFAULT NULL,
  `codigo_usuario` varchar(20) DEFAULT NULL,
  `ind_q19` tinyint(1)  DEFAULT NULL,
  `fecha_q19` date DEFAULT NULL,
  `tipo_carta` integer  DEFAULT NULL
);
CREATE TABLE `grupos` (
  `num_sec` integer PRIMARY KEY AUTOINCREMENT,
  `codigo_usuario` char(20) NOT NULL,
  `perfil` char(20) NOT NULL
);
CREATE TABLE `numeros_anillas` (
  `num_sec` integer PRIMARY KEY AUTOINCREMENT,
  `numero_criador` integer NOT NULL,
  `codigo_anilla` integer NOT NULL,
  `codigo_tipo_anilla` char(3) NOT NULL,
  `anno` char(2) NOT NULL,
  `codigo_diametro` char(2) NOT NULL,
  `numero_anilla` integer NOT NULL,
  `marca_especial` varchar(10) DEFAULT NULL,
  `numero_pedido` char(7) NOT NULL,
  `tipo_anilla` char(10) NOT NULL,
  `fecha_recepcion` date DEFAULT NULL,
  `numero_certif` varchar(45) DEFAULT NULL,
  `especie` varchar(45) DEFAULT NULL,
  `fecha_envio` date DEFAULT NULL
);
CREATE TABLE `paises` (
  `num_sec` integer PRIMARY KEY AUTOINCREMENT,
  `pais` varchar(45) DEFAULT NULL,
  `cee` tinyint(1) DEFAULT NULL,
  `continente` varchar(45) DEFAULT NULL,
  `importe_cuota` double DEFAULT NULL
); 
CREATE TABLE `pedidos` (
  `num_sec` integer PRIMARY KEY AUTOINCREMENT,
  `numero_pedido` char(7) NOT NULL,
  `fecha_pedido` date NOT NULL DEFAULT '0001-01-01',
  `numero_criador` integer  NOT NULL,
  `fecha_recepcion` date DEFAULT NULL,
  `ind_pedido` tinyint(1) DEFAULT NULL,
  `ind_recibido` tinyint(1) DEFAULT NULL,
  `ind_facturado` tinyint(1) DEFAULT NULL,
  `comentario` varchar(1500) DEFAULT NULL,
  `fecha_envio` date DEFAULT NULL,
  `codigo_usuario` varchar(20) DEFAULT NULL,
  `fecha_pago_anticipado` date DEFAULT NULL,
  `tipo_carta` integer  DEFAULT NULL,
  `gastos` double DEFAULT NULL,
  `tipo_iva` double DEFAULT NULL
);
CREATE TABLE `tipos_anillas` (
  `tipo_anilla` char(10) PRIMARY KEY DEFAULT '',
  `nombre` varchar(45) DEFAULT NULL,
  `codigo_tipo_anilla` char(3) DEFAULT NULL,
  `ordenacion_columnas` integer(10) DEFAULT NULL
);