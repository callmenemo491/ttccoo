package p171jd;

/* renamed from: jd.g0 */
/* loaded from: classes.dex */
public final class C3512g0 implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15172a;

    /* renamed from: b */
    public final androidx.constraintlayout.widget.ConstraintLayout f15173b;

    /* renamed from: c */
    public final androidx.appcompat.widget.AppCompatTextView f15174c;

    /* renamed from: d */
    public final androidx.appcompat.widget.AppCompatTextView f15175d;

    /* renamed from: e */
    public final androidx.appcompat.widget.AppCompatTextView f15176e;

    /* renamed from: f */
    public final androidx.appcompat.widget.AppCompatImageView f15177f;

    /* renamed from: g */
    public final java.lang.Object f15178g;

    /* renamed from: h */
    public final androidx.appcompat.widget.AppCompatImageView f15179h;

    /* renamed from: i */
    public final androidx.appcompat.widget.AppCompatTextView f15180i;

    /* renamed from: j */
    public final java.lang.Object f15181j;

    public C3512g0(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.appcompat.widget.AppCompatTextView r2, androidx.appcompat.widget.AppCompatTextView r3, androidx.appcompat.widget.AppCompatTextView r4, androidx.appcompat.widget.AppCompatImageView r5, androidx.cardview.widget.CardView r6, com.github.mikephil.charting.charts.LineChart r7, androidx.appcompat.widget.AppCompatImageView r8, androidx.appcompat.widget.AppCompatTextView r9, androidx.appcompat.widget.AppCompatTextView r10) {
            r0 = this;
            r6 = 0
            r0.f15172a = r6
            r0.<init>()
            r0.f15173b = r1
            r0.f15174c = r2
            r0.f15175d = r3
            r0.f15176e = r4
            r0.f15177f = r5
            r0.f15178g = r7
            r0.f15179h = r8
            r0.f15180i = r9
            r0.f15181j = r10
            return
    }

    /* renamed from: a */
    public static p171jd.C3512g0 m7982a(android.view.View r13) {
            r0 = 2131362021(0x7f0a00e5, float:1.834381E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L76
            r0 = 2131362066(0x7f0a0112, float:1.8343902E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L76
            r0 = 2131362072(0x7f0a0118, float:1.8343914E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L76
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            if (r7 == 0) goto L76
            r0 = 2131362265(0x7f0a01d9, float:1.8344306E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L76
            r0 = 2131362295(0x7f0a01f7, float:1.8344367E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r9 = r1
            com.github.mikephil.charting.charts.LineChart r9 = (com.github.mikephil.charting.charts.LineChart) r9
            if (r9 == 0) goto L76
            r0 = 2131362643(0x7f0a0353, float:1.8345072E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            if (r10 == 0) goto L76
            r0 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L76
            r0 = 2131362748(0x7f0a03bc, float:1.8345285E38)
            android.view.View r1 = p064e.C1494h.m4055f(r13, r0)
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L76
            jd.g0 r0 = new jd.g0
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L76:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15172a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.m7983c()
            return r0
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.m7983c()
            return r0
    }

    /* renamed from: c */
    public androidx.constraintlayout.widget.ConstraintLayout m7983c() {
            r1 = this;
            int r0 = r1.f15172a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L9
        L6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f15173b
            return r0
        L9:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f15173b
            return r0
    }
}
