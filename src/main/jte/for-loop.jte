@import java.util.List
@param List<String> items

<ul>
    @for(String item : items)
        <li>${item}</li>
    @endfor
</ul>