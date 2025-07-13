package p171jd;

/* renamed from: jd.m0 */
/* loaded from: classes.dex */
public final class C3536m0 implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final com.google.android.material.card.MaterialCardView f15333a;

    /* renamed from: b */
    public final androidx.appcompat.widget.AppCompatTextView f15334b;

    /* renamed from: c */
    public final androidx.appcompat.widget.AppCompatTextView f15335c;

    /* renamed from: d */
    public final androidx.appcompat.widget.AppCompatImageView f15336d;

    /* renamed from: e */
    public final androidx.appcompat.widget.AppCompatTextView f15337e;

    /* renamed from: f */
    public final androidx.appcompat.widget.AppCompatTextView f15338f;

    /* renamed from: g */
    public final androidx.appcompat.widget.AppCompatImageView f15339g;

    public C3536m0(com.google.android.material.card.MaterialCardView r1, androidx.appcompat.widget.AppCompatTextView r2, androidx.appcompat.widget.AppCompatTextView r3, androidx.appcompat.widget.AppCompatImageView r4, androidx.appcompat.widget.AppCompatTextView r5, androidx.appcompat.widget.AppCompatTextView r6, androidx.appcompat.widget.AppCompatImageView r7, androidx.appcompat.widget.LinearLayoutCompat r8) {
            r0 = this;
            r0.<init>()
            r0.f15333a = r1
            r0.f15334b = r2
            r0.f15335c = r3
            r0.f15336d = r4
            r0.f15337e = r5
            r0.f15338f = r6
            r0.f15339g = r7
            return
    }

    /* renamed from: a */
    public static p171jd.C3536m0 m8003a(android.view.View r11) {
            r0 = 2131361903(0x7f0a006f, float:1.8343571E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L5e
            r0 = 2131362223(0x7f0a01af, float:1.834422E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L5e
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L5e
            r0 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L5e
            r0 = 2131362584(0x7f0a0318, float:1.8344953E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L5e
            r0 = 2131362585(0x7f0a0319, float:1.8344955E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L5e
            r0 = 2131362707(0x7f0a0393, float:1.8345202E38)
            android.view.View r1 = p064e.C1494h.m4055f(r11, r0)
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat r10 = (androidx.appcompat.widget.LinearLayoutCompat) r10
            if (r10 == 0) goto L5e
            jd.m0 r0 = new jd.m0
            r3 = r11
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L5e:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public android.view.View mo1053b() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.f15333a
            return r0
    }
}
