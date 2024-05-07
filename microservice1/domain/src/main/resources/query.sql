CREATE TABLE public.productos (
	id bigserial not null,
	nombre varchar not null,
	codigo varchar not null,
	precio numeric not null
);


INSERT INTO public.productos
(nombre, codigo, precio)
VALUES('jugo de naranja', 'COD-01', 15);

INSERT INTO public.productos
(nombre, codigo, precio)
VALUES('jugo de manzana', 'COD-02', 20);

INSERT INTO public.productos
(nombre, codigo, precio)
VALUES('jugo de durazno', 'COD-03', 11);

select *
from public.productos
