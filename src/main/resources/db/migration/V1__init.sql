CREATE TABLE `trabajo` (
  `id` bigint(20) NOT NULL,
  `descripcion_corta` varchar(64) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `hora` float DEFAULT NULL,
  `id_trabajo` int(11) DEFAULT NULL,
  `paciente_id` bigint(11) default NULL

) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

CREATE TABLE `paciente` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(64) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `telefono` varchar (64) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `trabajo_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;


ALTER TABLE `trabajo`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `trabajo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
ALTER TABLE `paciente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;