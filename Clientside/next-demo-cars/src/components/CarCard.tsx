"use client";
import { Car } from '@/types/types'
import React, { useState } from 'react'
import EngineCard from './EngineCard'
import CarInformation from './CarInformation'

type Props = {
    car: Car,
}

const CarCard = (props: Props) => {

    const [isActive, setIsActive] = useState(false)

    return (
        <div className={
            `flex flex-col border p-3 w-full rounded-2xl transition-all duration-300 
            ${isActive ? 'bg-emerald-300' : 'bg-emerald-100'}`}
            onClick={() => {
                changeState();
            }
            }>
            <CarInformation car={props.car}></CarInformation>
            <EngineCard motor={props.car.motor}></EngineCard>
        </div >
    )

    function changeState() {
        setIsActive(!isActive);
    }
}

export default CarCard