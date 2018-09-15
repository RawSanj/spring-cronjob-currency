$(document).ready( function () {
	 var table = $('#currencyTable').DataTable({
			"sAjaxSource": "/currency",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "code" },
				  { "mData": "name" },
				  { "mData": "rate" },
				  { "mData": "checkedAt" }
			]
	 })
});