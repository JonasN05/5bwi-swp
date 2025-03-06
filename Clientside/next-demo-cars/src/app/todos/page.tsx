"use client"
import ToDo from '@/components/ToDo';
import { Item } from '@/types/types';
import React, { useEffect, useState } from 'react'

type Props = {

}

const page = (props: Props) => {
    const [toDos, setToDos] = useState<Item[]>([]);

    useEffect(() => {
        async function loadData() {
            const response = await fetch(`https://657c5542853beeefdb993793.mockapi.io/swp/react/ToDos`);
            const data = await response.json();
            console.log(data);
            setToDos(data);
        }
        loadData();
    }, [])

    return (
        <div className='flex flex-col justify-center'>
            {toDos.map((todo) => (
                <ToDo toDo={todo}></ToDo>
            ))
            }
        </div >
    )


}

export default page