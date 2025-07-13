package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1170o implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.datepicker.C1169n f6117Y;

    public ViewOnClickListenerC1170o(com.google.android.material.datepicker.C1169n r1) {
            r0 = this;
            r0.f6117Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            com.google.android.material.datepicker.n r2 = r1.f6117Y
            android.widget.Button r0 = r2.f6097A1
            com.google.android.material.datepicker.c<S> r2 = r2.f6103p1
            boolean r2 = r2.m3404C()
            r0.setEnabled(r2)
            com.google.android.material.datepicker.n r2 = r1.f6117Y
            com.google.android.material.internal.CheckableImageButton r2 = r2.f6112y1
            r2.toggle()
            com.google.android.material.datepicker.n r2 = r1.f6117Y
            com.google.android.material.internal.CheckableImageButton r0 = r2.f6112y1
            r2.m3422Q0(r0)
            com.google.android.material.datepicker.n r2 = r1.f6117Y
            r2.m3420O0()
            return
    }
}
