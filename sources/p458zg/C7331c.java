package p458zg;

/* renamed from: zg.c */
/* loaded from: classes.dex */
public final class C7331c {
    /* renamed from: a */
    public static final void m14402a(androidx.fragment.app.ComponentCallbacksC0395n r1, p013ah.C0100a r2) {
            if (r1 == 0) goto L10
            androidx.fragment.app.s r1 = r1.m1333s()
            if (r1 == 0) goto L10
            zg.b r0 = new zg.b
            r0.<init>(r2)
            m14404c(r1, r0)
        L10:
            return
    }

    /* renamed from: b */
    public static final void m14403b(androidx.fragment.app.ComponentCallbacksC0395n r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r2, r0)
            if (r1 == 0) goto L18
            androidx.fragment.app.s r1 = r1.m1333s()
            if (r1 == 0) goto L18
            p214m2.C4339q.m9706k(r2, r0)
            zg.a r0 = new zg.a
            r0.<init>(r2, r3)
            m14404c(r1, r0)
        L18:
            return
    }

    /* renamed from: c */
    public static final void m14404c(android.app.Activity r11, mh.InterfaceC4620l<? super p458zg.C7334f, ch.C0985l> r12) {
            if (r11 != 0) goto L3
            return
        L3:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r11)
            r1 = 0
            r2 = 2131558463(0x7f0d003f, float:1.8742243E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r1, r3)
            r1 = 2131361953(0x7f0a00a1, float:1.8343673E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r6 = r2
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L87
            r1 = 2131361961(0x7f0a00a9, float:1.834369E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L87
            r1 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            if (r8 == 0) goto L87
            r1 = 2131362636(0x7f0a034c, float:1.8345058E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            com.google.android.material.textview.MaterialTextView r2 = (com.google.android.material.textview.MaterialTextView) r2
            if (r2 == 0) goto L87
            r1 = 2131362703(0x7f0a038f, float:1.8345194E38)
            android.view.View r4 = p064e.C1494h.m4055f(r0, r1)
            r10 = r4
            com.google.android.material.textview.MaterialTextView r10 = (com.google.android.material.textview.MaterialTextView) r10
            if (r10 == 0) goto L87
            jd.l r1 = new jd.l
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4 = r1
            r5 = r0
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            h8.b r4 = new h8.b
            r4.<init>(r11, r3)
            r4.m7363a(r0)
            androidx.appcompat.app.b r11 = r4.create()
            zg.f r0 = new zg.f
            r0.<init>(r11, r1)
            r12.mo107b(r0)
            java.lang.CharSequence r12 = r2.getText()
            r0 = 1
            if (r12 == 0) goto L79
            boolean r12 = p362uh.C6463i.m13054K(r12)
            if (r12 == 0) goto L77
            goto L79
        L77:
            r12 = 0
            goto L7a
        L79:
            r12 = 1
        L7a:
            r12 = r12 ^ r0
            if (r12 == 0) goto L7e
            goto L80
        L7e:
            r3 = 8
        L80:
            r2.setVisibility(r3)
            r11.show()
            return
        L87:
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r11 = r11.getResourceName(r1)
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r11 = r0.concat(r11)
            r12.<init>(r11)
            throw r12
    }

    /* renamed from: d */
    public static final void m14405d(androidx.fragment.app.ComponentCallbacksC0395n r0, mh.InterfaceC4620l<? super p458zg.C7334f, ch.C0985l> r1) {
            if (r0 == 0) goto L7
            androidx.fragment.app.s r0 = r0.m1333s()
            goto L8
        L7:
            r0 = 0
        L8:
            m14404c(r0, r1)
            return
    }
}
