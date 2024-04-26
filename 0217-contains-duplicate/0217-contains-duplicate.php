class Solution {

    /**
     * @param Integer[] $nums
     * @return Boolean
     */
    function containsDuplicate($nums) {
        $map = [];
        $length = count($nums);
        for($i = 0; $i < $length; $i++) {
            if (array_key_exists($nums[$i], $map)) {
                return true;
            }

            $map[$nums[$i]] = $i;
        }

        return false;
    }
}