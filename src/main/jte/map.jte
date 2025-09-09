@import java.util.Map
@param Map<String, String> userMap

<h3>Method 1: EntrySet (Simple version)</h3>
@for(var entry : userMap.entrySet())
    <p>${entry.getKey()}: ${entry.getValue()}</p>
@endfor

<h3>Method 2: Short Syntax (JTE-specific)</h3>
@for(var key : userMap.keySet())
    <p>${key}: ${userMap.get(key)}</p>
@endfor