<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class user extends Model
{
    public $table = 'users';
    public $guarded = [];
}
