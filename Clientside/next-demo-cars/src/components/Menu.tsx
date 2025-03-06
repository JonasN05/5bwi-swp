import Link from 'next/link'
import React from 'react'

type Props = {}

const Menu = (props: Props) => {
    return (
        <div>
            <ul className='flex '>
                <Link href="/">
                    <li className='p-2 hover:bg-amber-100'>Home</li>
                </Link>
                <Link href="/cars">
                    <li className='p-2 hover:bg-amber-100'>Cars</li>
                </Link>
                <Link href="/trucks">
                    <li className='p-2 hover:bg-amber-100'>Trucks</li>
                </Link>
                <Link href="/todos">
                    <li className='p-2 hover:bg-amber-100'>ToDos</li>
                </Link>
            </ul>
        </div >
    )
}

export default Menu
