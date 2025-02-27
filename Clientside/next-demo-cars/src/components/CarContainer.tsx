import { Car } from '@/types/types'
import React from 'react'
import CarCard from './CarCard';

const cars: Car[] = [
    {
        carName: "Model S",
        brand: "Tesla",
        color: "Red",
        motor: {
            name: "Electric Dual Motor",
            horsepower: 670
        }
    },
    {
        carName: "M3 Competition",
        brand: "BMW",
        color: "Blue",
        motor: {
            name: "3.0L Twin-Turbo",
            horsepower: 503
        }
    },
    {
        carName: "911 Turbo S",
        brand: "Porsche",
        color: "White",
        motor: {
            name: "3.7L Twin-Turbo",
            horsepower: 640
        }
    },
    {
        carName: "A6 Avant",
        brand: "Audi",
        color: "Black",
        motor: {
            name: "3.0L V6 TDI",
            horsepower: 286
        }
    },
    {
        carName: "Mustang GT",
        brand: "Ford",
        color: "Yellow",
        motor: {
            name: "5.0L V8",
            horsepower: 450
        }
    }
];

type Props = {}



const CarContainer = (props: Props) => {
    return (
        <div className='flex justify-center items-center flex-col'>
            <div className='mb-5 text-lg'>Car Container</div>
            {cars.map((car: Car) => <CarCard car={car}></CarCard>)}
        </div>
    )
}

export default CarContainer