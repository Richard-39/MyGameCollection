CREATE SCHEMA `Juegos_Xbox` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
use Juegos_Xbox;

create table juegos (
id_juego int auto_increment,
nombre text,
plataforma text,
lenguaje text,
genero text,
caratula_url text,
descripcion text,
trailer_url text,
gameplay_url text,
screeshot_url text,
puntuacion int,
prioridad text,
descarga_url text,
adquirido boolean,
descargado boolean,
terminado boolean,
constraint pk_id_juego primary key (id_juego)
);

create table ofertas (
id_oferta int auto_increment,
id_juego int,
precio int,
nombre_vendedor text,
enlace_venta text,
constraint pk_id_oferta primary key (id_oferta),
constraint fk_id_juego foreign key (id_juego) references juegos (id_juego)
);

-- juegos de ejemplo
INSERT INTO `Juegos_Xbox`.`juegos` (`nombre`, `plataforma`, `lenguaje`, `genero`, `caratula_url`, `descripcion`, `trailer_url`, `gameplay_url`, `screeshot_url`, `puntuacion`, `prioridad`, `descarga_url`, `adquirido`, `descargado`, `terminado`) VALUES ('Just Dance 4 ', 'Xbox 360', 'ESP', 'Musical', 'https://www.covercaratulas.com/ode2/xbox360/Just_Dance_4_-_Dvd_por_SergioFalcuan_[xbox360]_80.jpg', 'es un videojuego desarrollado por Ubisoft para Wii, PlayStation 3 (Requiere PlayStation Move), Xbox 360 (Requiere Kinect) y Wii U (Requiere wiimote). Es el sucesor del juego Just Dance 3 y antecede el Just Dance 2014. En cuanto a música, gráficos y contenidos es bastante diferente a su antecesor.1​ ', 'https://www.youtube.com/watch?v=dQcYT88ZgQE', 'https://www.youtube.com/watch?v=KBnsagCRu14', 'https://cl.buscafs.com/www.levelup.com/public/uploads/images/138450.jpg', '9', 'Alta', 'https://dlxbgame.net/just-dance-4-jtag-rgh/', '0', '1', '0');
INSERT INTO `Juegos_Xbox`.`juegos` (`nombre`, `plataforma`, `lenguaje`, `genero`, `caratula_url`, `descripcion`, `trailer_url`, `gameplay_url`, `screeshot_url`, `puntuacion`, `prioridad`, `descarga_url`, `adquirido`, `descargado`, `terminado`) VALUES ('Skyrim', 'Xbox 360', 'ESP', 'RPG', 'https://www.covercaratulas.com/ode2/xbox360/The_Elder_Scrolls_V_-_Skyrim_-_Frontal_por_BMOMARZ_[xbox360]_80.jpg', 'The Elder Scrolls V: Skyrim es un videojuego de rol de acción del tipo mundo abierto desarrollado por Bethesda Game Studios y publicado por Bethesda Softworks. Skyrim es la quinta entrega de la saga de videojuegos de acción y fantasía de la serie The Elder Scrolls y es posterior a The Elder Scrolls IV: Oblivion y predecesor de The Elder Scrolls Online. Skyrim salió a la venta el 11 de noviembre de 20111​ para las plataformas: Microsoft Windows, Xbox 360 y PlayStation 3. El 26 de julio de 2012 fueron lanzados al mercado tres expansiones que son descargables: Dawnguard, Hearthfire y Dragonborn. El 28 de octubre de 2016 fue lanzada una remasterización llamada: Skyrim Special Edition. Incluye el juego original y los complementos, así como nuevas características: gráficos y efectos renovados. ', 'https://www.youtube.com/watch?v=JSRtYpNRoN0', 'https://www.youtube.com/watch?v=lI1lkPPMPQQ', 'https://www.h3xed.com/img/skyrim-ss-01.jpg', '10', 'Alta', 'https://dlxbgame.net/the-elder-scrolls-v-skyrim-legendary-edition-jtag-rgh/', '0', '0', '0');

-- ofertas de ejemplo
INSERT INTO `Juegos_Xbox`.`ofertas` (`id_juego`, `precio`, `nombre_vendedor`, `enlace_venta`) VALUES ('1', '10000', 'Raúl Reyes', 'https://www.yapo.cl/region_metropolitana/consolas_videojuegos/juegos_para_xbox_360_kinect_76068735.htm?ca=15_s&oa=76068735&xsp=31');
