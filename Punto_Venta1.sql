-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 11-02-2023 a las 06:30:25
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Punto_Venta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_pr`
--

CREATE TABLE `categoria_pr` (
  `idCatego` int(11) NOT NULL,
  `Categoria` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria_pr`
--

INSERT INTO `categoria_pr` (`idCatego`, `Categoria`) VALUES
(1, 'Cafe'),
(2, 'Galletas'),
(3, 'Té');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Clientes`
--

CREATE TABLE `Clientes` (
  `idCliente` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Edad` varchar(45) NOT NULL,
  `Telefono` varchar(45) NOT NULL,
  `Email` varchar(55) NOT NULL,
  `NumVisi` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Clientes`
--

INSERT INTO `Clientes` (`idCliente`, `Nombre`, `Apellidos`, `Edad`, `Telefono`, `Email`, `NumVisi`) VALUES
(1, 'Predeterminado', '', '0', '0', '', 1),
(2, 'Alejandra', 'Alvarez', '22', '6699346578', 'ale@mail.com', 1),
(3, 'Justin', 'Hernandez', '20', '6692452365', 'justin@mail.com', 1),
(4, 'Julieta', 'Alvarez', '21', '6699343434', 'yuli@mail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `idInventario` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `Cantidad` double NOT NULL,
  `unidad` varchar(50) NOT NULL,
  `PrecioUni` double NOT NULL,
  `Proveedor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`idInventario`, `nombre`, `Cantidad`, `unidad`, `PrecioUni`, `Proveedor`) VALUES
(1, 'Leche', 50, 'Litros', 10, 'Soriana'),
(2, 'Cafe', 20, 'Kilogramos', 5, 'Soriana'),
(3, 'Azucar Glass', 20, 'Kilogramos', 10, 'Sams'),
(4, 'Sal', 10, 'Kilogramos', 10, 'Sams'),
(5, 'Pimienta', 10, 'Kilogramos', 10, 'Sams'),
(6, 'Caramello', 20, 'Kilogramos', 10, 'Sams'),
(7, 'Vasos', 20, 'Kilogramos', 5, 'Sams'),
(8, 'Azucar Morena', 20, 'KIlogramos', 5, 'Soriana'),
(9, 'Cafe Capuccino', 20, 'Kilogramos', 10, 'Nescafe'),
(10, 'Cafe Irlandes', 20, 'Kilogramos', 10, 'Soriana'),
(11, 'Canela', 20, 'Kilogramos', 10, 'Fruteria'),
(12, 'Chocolate', 20, 'Kilogramos', 1, 'Sams'),
(13, 'Cocoa', 20, 'Kilogramos ', 12, 'Sams'),
(14, 'Te', 15, 'Kilogramos', 12, 'Sams'),
(15, 'Leche Desc', 12, 'Litros', 10, 'Soriana'),
(16, 'Leche Light', 20, 'Litros', 12, 'Soriana'),
(17, 'Mermelada', 10, 'Litros', 20, 'Soriana'),
(18, 'Jamon', 10, 'Kilogramos', 20, 'Soriaana'),
(19, 'Jamon', 10, 'Kilogramos', 20, 'Soriaana'),
(20, 'Aguacate', 20, 'Kilogramos', 60, 'Fruteria Macias');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metodo_pago`
--

CREATE TABLE `metodo_pago` (
  `idMP` int(11) NOT NULL,
  `Metodo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `metodo_pago`
--

INSERT INTO `metodo_pago` (`idMP`, `Metodo`) VALUES
(1, 'Efectivo'),
(2, 'Targeta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tamaño` double NOT NULL,
  `unidad` varchar(50) NOT NULL,
  `precioVent` double NOT NULL,
  `idCatego` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProducto`, `nombre`, `tamaño`, `unidad`, `precioVent`, `idCatego`) VALUES
(1, 'Cafe Sencillo', 8, 'Onzas', 50, 1),
(2, 'Chai Latte', 8, 'Onzas', 60, 1),
(3, 'Galletas de Avena', 200, 'Gramos', 50, 2),
(4, 'Te de Manzanilla', 200, 'Gramos', 50, 3),
(5, 'Cafe Americano', 4, 'Onzas', 50, 1),
(6, 'Frapuccino Moka ', 8, 'Onzas', 80, 1),
(7, 'Cafe Expresso', 4, 'Onzas', 50, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta_prod`
--

CREATE TABLE `receta_prod` (
  `id_ingrd` int(11) NOT NULL,
  `ingrediente` varchar(50) NOT NULL,
  `cantidad` double NOT NULL,
  `unidad` varchar(50) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idInventario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `receta_prod`
--

INSERT INTO `receta_prod` (`id_ingrd`, `ingrediente`, `cantidad`, `unidad`, `idProducto`, `idInventario`) VALUES
(1, 'Leche', 0.35, 'Litros', 1, 1),
(3, 'Leche', 0.5, 'Litros', 2, 1),
(4, 'Leche', 0.3, 'Litros', 5, 1),
(5, 'Cafe', 0.4, 'Kilogramos', 5, 2),
(6, 'Azucar Morena', 0.02, 'Kilogramos', 4, 8),
(7, 'Vasos', 1, 'Kilogramos', 4, 7),
(8, 'Cafe', 0.2, 'Litros', 1, 2),
(9, 'Leche', 1, 'Litros', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `id_tipo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`id_tipo`, `nombre`) VALUES
(1, 'Administrador'),
(2, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `tel` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `id_tipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `usuario`, `nombre`, `apellido`, `tel`, `password`, `id_tipo`) VALUES
(1, 'admin', 'Issac', 'Puga', 'null', 'd033e22ae348aeb5660fc2140aec35850c4da997', 1),
(2, 'usr', 'Diana', 'Rice', 'null', 'd033e22ae348aeb5660fc2140aec35850c4da997', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVent` int(11) NOT NULL,
  `total` double NOT NULL,
  `referencias` varchar(45) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT current_timestamp(),
  `idVE` int(11) DEFAULT NULL,
  `idMP` int(11) UNSIGNED DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVent`, `total`, `referencias`, `fecha`, `idVE`, `idMP`, `idCliente`) VALUES
(37, 200, NULL, '2023-02-10 06:46:52', 2, 1, 1),
(38, 100, NULL, '2023-02-10 06:47:02', 2, 1, 1),
(39, 50, '0', '2023-02-10 06:41:25', 2, 1, 1),
(41, 50, NULL, '2023-02-10 06:50:17', 2, 1, 1),
(42, 50, NULL, '2023-02-10 06:53:52', 2, 1, 1),
(43, 0, NULL, '2023-02-10 07:03:20', 2, 1, 1),
(44, 0, NULL, '2023-02-10 07:03:49', 2, 1, 1),
(45, 50, NULL, '2023-02-10 07:10:26', 2, 1, 2),
(46, 60, NULL, '2023-02-10 08:55:06', 2, 1, 1),
(47, 120, NULL, '2023-02-10 08:57:33', 2, 1, 1),
(48, 100, NULL, '2023-02-10 08:58:12', 2, 1, 1),
(49, 50, '1234455', '2023-02-10 09:45:35', 2, 1, 1),
(50, 50, NULL, '2023-02-10 10:06:19', 2, 1, 1),
(51, 100, '234542345', '2023-02-10 10:06:59', 2, 1, 1),
(52, 50, NULL, '2023-02-10 10:49:53', 2, 1, 1),
(53, 160, NULL, '2023-02-10 10:53:29', 2, 1, 1),
(54, 240, NULL, '2023-02-10 19:35:16', 2, 1, 2),
(55, 100, NULL, '2023-02-10 19:37:17', 2, 1, 3),
(56, 100, NULL, '2023-02-10 22:32:58', 2, 1, 3),
(58, 0, NULL, NULL, 1, 1, 1),
(59, 0, NULL, NULL, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_estado`
--

CREATE TABLE `venta_estado` (
  `idVE` int(11) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta_estado`
--

INSERT INTO `venta_estado` (`idVE`, `Estado`) VALUES
(1, 'Pendiente'),
(2, 'Terminada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_prod`
--

CREATE TABLE `venta_prod` (
  `idVP` int(11) NOT NULL,
  `cantidad` int(55) DEFAULT NULL,
  `idVent` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta_prod`
--

INSERT INTO `venta_prod` (`idVP`, `cantidad`, `idVent`, `idProducto`) VALUES
(36, 1, 37, 1),
(37, 2, 37, 3),
(38, 1, 37, 1),
(39, 2, 38, 1),
(40, 1, 39, 1),
(42, 1, 41, 1),
(43, 1, 42, 1),
(44, 1, 45, 5),
(45, 1, 46, 2),
(46, 2, 47, 2),
(47, 2, 48, 1),
(48, 1, 49, 1),
(49, 1, 50, 1),
(50, 2, 51, 5),
(51, 1, 52, 3),
(52, 2, 53, 6),
(53, 2, 54, 2),
(54, 1, 54, 2),
(55, 1, 54, 2),
(56, 1, 55, 7),
(57, 1, 55, 3),
(58, 1, 56, 3),
(59, 1, 56, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria_pr`
--
ALTER TABLE `categoria_pr`
  ADD PRIMARY KEY (`idCatego`);

--
-- Indices de la tabla `Clientes`
--
ALTER TABLE `Clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`idInventario`);

--
-- Indices de la tabla `metodo_pago`
--
ALTER TABLE `metodo_pago`
  ADD PRIMARY KEY (`idMP`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `fkcatego_prod` (`idCatego`);

--
-- Indices de la tabla `receta_prod`
--
ALTER TABLE `receta_prod`
  ADD PRIMARY KEY (`id_ingrd`),
  ADD KEY `fkrecetaProd_producto` (`idProducto`),
  ADD KEY `fkrecetaInv_inventario` (`idInventario`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`id_tipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `fkusuarios_tipo` (`id_tipo`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVent`),
  ADD KEY `fkClientes_ven` (`idCliente`),
  ADD KEY `fkestado_ven` (`idVE`),
  ADD KEY `fkmetodopago_ventas` (`idMP`);

--
-- Indices de la tabla `venta_estado`
--
ALTER TABLE `venta_estado`
  ADD PRIMARY KEY (`idVE`);

--
-- Indices de la tabla `venta_prod`
--
ALTER TABLE `venta_prod`
  ADD PRIMARY KEY (`idVP`),
  ADD KEY `fkventaprodd_producto` (`idProducto`),
  ADD KEY `fkventaprod_ventas` (`idVent`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria_pr`
--
ALTER TABLE `categoria_pr`
  MODIFY `idCatego` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `Clientes`
--
ALTER TABLE `Clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `idInventario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `metodo_pago`
--
ALTER TABLE `metodo_pago`
  MODIFY `idMP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `receta_prod`
--
ALTER TABLE `receta_prod`
  MODIFY `id_ingrd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVent` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT de la tabla `venta_estado`
--
ALTER TABLE `venta_estado`
  MODIFY `idVE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `venta_prod`
--
ALTER TABLE `venta_prod`
  MODIFY `idVP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fkcatego_prod` FOREIGN KEY (`idCatego`) REFERENCES `categoria_pr` (`idCatego`);

--
-- Filtros para la tabla `receta_prod`
--
ALTER TABLE `receta_prod`
  ADD CONSTRAINT `fkrecetaInv_inventario` FOREIGN KEY (`idInventario`) REFERENCES `inventario` (`idInventario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkrecetaProd_producto` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fkusuarios_tipo` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_usuario` (`id_tipo`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fkClientes_ven` FOREIGN KEY (`idCliente`) REFERENCES `Clientes` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkestado_ven` FOREIGN KEY (`idVE`) REFERENCES `venta_estado` (`idVE`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `venta_prod`
--
ALTER TABLE `venta_prod`
  ADD CONSTRAINT `fkventaprod_ventas` FOREIGN KEY (`idVent`) REFERENCES `ventas` (`idVent`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fkventaprodd_producto` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
