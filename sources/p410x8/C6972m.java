package p410x8;

/* renamed from: x8.m */
/* loaded from: classes.dex */
public class C6972m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.textfield.MaterialAutoCompleteTextView f27245Y;

    public C6972m(com.google.android.material.textfield.MaterialAutoCompleteTextView r1) {
            r0 = this;
            r0.f27245Y = r1
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            r7 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            r0 = 0
            if (r10 >= 0) goto L16
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            boolean r1 = r8.mo473b()
            if (r1 != 0) goto Lf
            r8 = r0
            goto L1e
        Lf:
            androidx.appcompat.widget.f0 r8 = r8.f1329a0
            java.lang.Object r8 = r8.getSelectedItem()
            goto L1e
        L16:
            android.widget.ListAdapter r8 = r8.getAdapter()
            java.lang.Object r8 = r8.getItem(r10)
        L1e:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r7.f27245Y
            com.google.android.material.textfield.MaterialAutoCompleteTextView.m3541a(r1, r8)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            android.widget.AdapterView$OnItemClickListener r1 = r8.getOnItemClickListener()
            if (r1 == 0) goto L78
            if (r9 == 0) goto L34
            if (r10 >= 0) goto L30
            goto L34
        L30:
            r3 = r9
            r4 = r10
            r5 = r11
            goto L6f
        L34:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            boolean r9 = r8.mo473b()
            if (r9 != 0) goto L40
            r9 = r0
            goto L47
        L40:
            androidx.appcompat.widget.f0 r8 = r8.f1329a0
            android.view.View r8 = r8.getSelectedView()
            r9 = r8
        L47:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            boolean r10 = r8.mo473b()
            if (r10 != 0) goto L54
            r8 = -1
            r10 = -1
            goto L5b
        L54:
            androidx.appcompat.widget.f0 r8 = r8.f1329a0
            int r8 = r8.getSelectedItemPosition()
            r10 = r8
        L5b:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            boolean r11 = r8.mo473b()
            if (r11 != 0) goto L68
            r11 = -9223372036854775808
            goto L30
        L68:
            androidx.appcompat.widget.f0 r8 = r8.f1329a0
            long r11 = r8.getSelectedItemId()
            goto L30
        L6f:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            androidx.appcompat.widget.f0 r2 = r8.f1329a0
            r1.onItemClick(r2, r3, r4, r5)
        L78:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r7.f27245Y
            androidx.appcompat.widget.j0 r8 = r8.f6355d0
            r8.dismiss()
            return
    }
}
