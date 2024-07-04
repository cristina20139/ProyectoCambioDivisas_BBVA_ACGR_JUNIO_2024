import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'keyValue'
})
export class KeyValuePipe implements PipeTransform {
  transform(value: { [key: string]: number }): { key: string, value: number }[] {
    return Object.keys(value).map(key => ({ key, value: value[key] }));
  }
}
