package p458zg;

/* renamed from: zg.f */
/* loaded from: classes.dex */
public final class C7334f {

    /* renamed from: a */
    public final androidx.appcompat.app.DialogC0204b f28077a;

    /* renamed from: b */
    public final p171jd.C3531l f28078b;

    /* renamed from: zg.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28079a = null;

        static {
                zg.d[] r0 = p458zg.EnumC7332d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 1
                r0[r1] = r2
                r1 = 2
                r0[r2] = r1
                r2 = 3
                r0[r1] = r2
                r1 = 4
                r0[r2] = r1
                r2 = 5
                r0[r2] = r2
                r2 = 6
                r0[r1] = r2
                p458zg.C7334f.a.f28079a = r0
                return
        }
    }

    public C7334f(androidx.appcompat.app.DialogC0204b r1, p171jd.C3531l r2) {
            r0 = this;
            r0.<init>()
            r0.f28077a = r1
            r0.f28078b = r2
            return
    }

    /* renamed from: a */
    public static void m14406a(p458zg.C7334f r2, java.lang.Integer r3, java.lang.CharSequence r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            if (r4 != 0) goto L21
            if (r3 == 0) goto L20
            r3.intValue()
            androidx.appcompat.app.b r4 = r2.f28077a
            android.content.Context r4 = r4.getContext()
            int r3 = r3.intValue()
            java.lang.String r1 = r4.getString(r3)
        L20:
            r4 = r1
        L21:
            jd.l r2 = r2.f28078b
            java.lang.Object r2 = r2.f15305f
            com.google.android.material.textview.MaterialTextView r2 = (com.google.android.material.textview.MaterialTextView) r2
            r2.setText(r4)
            return
    }

    /* renamed from: b */
    public static void m14407b(p458zg.C7334f r2, java.lang.Integer r3, java.lang.CharSequence r4, mh.InterfaceC4609a r5, int r6) {
            r4 = r6 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r4 = r6 & 4
            if (r4 == 0) goto Lb
            r5 = r0
        Lb:
            jd.l r4 = r2.f28078b
            java.lang.Object r4 = r4.f15303d
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L3d
            zg.e r6 = new zg.e
            r1 = 0
            r6.<init>(r5, r2, r1)
            r4.setOnClickListener(r6)
            if (r3 == 0) goto L2f
            r3.intValue()
            androidx.appcompat.app.b r2 = r2.f28077a
            android.content.Context r2 = r2.getContext()
            int r3 = r3.intValue()
            java.lang.String r0 = r2.getString(r3)
        L2f:
            if (r0 == 0) goto L38
            r4.setText(r0)
            r4.setVisibility(r1)
            goto L3d
        L38:
            r2 = 8
            r4.setVisibility(r2)
        L3d:
            return
    }

    /* renamed from: c */
    public static void m14408c(p458zg.C7334f r2, java.lang.Integer r3, java.lang.CharSequence r4, mh.InterfaceC4609a r5, int r6) {
            r4 = r6 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r4 = r6 & 4
            if (r4 == 0) goto Lb
            r5 = r0
        Lb:
            jd.l r4 = r2.f28078b
            java.lang.Object r4 = r4.f15302c
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L3b
            zg.e r6 = new zg.e
            r1 = 1
            r6.<init>(r5, r2, r1)
            r4.setOnClickListener(r6)
            if (r3 == 0) goto L2f
            r3.intValue()
            androidx.appcompat.app.b r2 = r2.f28077a
            android.content.Context r2 = r2.getContext()
            int r3 = r3.intValue()
            java.lang.String r0 = r2.getString(r3)
        L2f:
            if (r0 == 0) goto L36
            r4.setText(r0)
            r2 = 0
            goto L38
        L36:
            r2 = 8
        L38:
            r4.setVisibility(r2)
        L3b:
            return
    }

    /* renamed from: e */
    public static void m14409e(p458zg.C7334f r2, java.lang.Integer r3, java.lang.CharSequence r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            if (r4 != 0) goto L22
            if (r3 == 0) goto L21
            r3.intValue()
            androidx.appcompat.app.b r4 = r2.f28077a
            android.content.Context r4 = r4.getContext()
            int r3 = r3.intValue()
            java.lang.String r4 = r4.getString(r3)
            goto L22
        L21:
            r4 = r1
        L22:
            if (r4 == 0) goto L28
            java.lang.String r1 = r4.toString()
        L28:
            jd.l r2 = r2.f28078b
            java.lang.Object r2 = r2.f15306g
            com.google.android.material.textview.MaterialTextView r2 = (com.google.android.material.textview.MaterialTextView) r2
            r2.setText(r1)
            return
    }

    /* renamed from: d */
    public final void m14410d(p458zg.EnumC7332d r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = -1
            goto Lc
        L4:
            int[] r0 = p458zg.C7334f.a.f28079a
            int r2 = r2.ordinal()
            r2 = r0[r2]
        Lc:
            switch(r2) {
                case 1: goto L25;
                case 2: goto L21;
                case 3: goto L1d;
                case 4: goto L19;
                case 5: goto L15;
                case 6: goto L11;
                default: goto Lf;
            }
        Lf:
            r2 = 0
            goto L2c
        L11:
            r2 = 2131231077(0x7f080165, float:1.8078225E38)
            goto L28
        L15:
            r2 = 2131231076(0x7f080164, float:1.8078223E38)
            goto L28
        L19:
            r2 = 2131231031(0x7f080137, float:1.8078132E38)
            goto L28
        L1d:
            r2 = 2131231032(0x7f080138, float:1.8078134E38)
            goto L28
        L21:
            r2 = 2131231030(0x7f080136, float:1.807813E38)
            goto L28
        L25:
            r2 = 2131231027(0x7f080133, float:1.8078123E38)
        L28:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L2c:
            if (r2 == 0) goto L3b
            int r2 = r2.intValue()
            jd.l r0 = r1.f28078b
            java.lang.Object r0 = r0.f15304e
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r0.setImageResource(r2)
        L3b:
            return
    }
}
