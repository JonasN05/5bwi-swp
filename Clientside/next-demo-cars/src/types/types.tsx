export interface Car {
    carName: string,
    brand: string,
    color: string,
    motor: Motor
}

export interface Motor {
    name: string,
    horsepower: number,
}