package p171jd;

/* renamed from: jd.x */
/* loaded from: classes.dex */
public final class C3570x implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15626a;

    /* renamed from: b */
    public final java.lang.Object f15627b;

    /* renamed from: c */
    public final java.lang.Object f15628c;

    /* renamed from: d */
    public final java.lang.Object f15629d;

    /* renamed from: e */
    public final java.lang.Object f15630e;

    /* renamed from: f */
    public final androidx.appcompat.widget.AppCompatTextView f15631f;

    public C3570x(androidx.constraintlayout.widget.ConstraintLayout r2, androidx.appcompat.widget.AppCompatTextView r3, androidx.appcompat.widget.AppCompatImageView r4, androidx.appcompat.widget.AppCompatImageView r5, androidx.appcompat.widget.AppCompatTextView r6) {
            r1 = this;
            r0 = 1
            r1.f15626a = r0
            r1.<init>()
            r1.f15627b = r2
            r1.f15631f = r3
            r1.f15630e = r4
            r1.f15628c = r5
            r1.f15629d = r6
            return
    }

    public C3570x(com.google.android.material.card.MaterialCardView r2, androidx.appcompat.widget.AppCompatTextView r3, androidx.appcompat.widget.AppCompatImageView r4, androidx.appcompat.widget.AppCompatTextView r5, androidx.appcompat.widget.AppCompatTextView r6) {
            r1 = this;
            r0 = 5
            r1.f15626a = r0
            r1.<init>()
            r1.f15627b = r2
            r1.f15631f = r3
            r1.f15630e = r4
            r1.f15628c = r5
            r1.f15629d = r6
            return
    }

    public C3570x(com.google.android.material.card.MaterialCardView r2, com.google.android.material.button.MaterialButton r3, com.google.android.material.imageview.ShapeableImageView r4, androidx.appcompat.widget.AppCompatTextView r5, androidx.appcompat.widget.AppCompatTextView r6) {
            r1 = this;
            r0 = 2
            r1.f15626a = r0
            r1.<init>()
            r1.f15627b = r2
            r1.f15630e = r3
            r1.f15628c = r4
            r1.f15631f = r5
            r1.f15629d = r6
            return
    }

    /* renamed from: a */
    public static p171jd.C3570x m8011a(android.view.View r8) {
            r0 = 2131361928(0x7f0a0088, float:1.8343622E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L3a
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            if (r5 == 0) goto L3a
            r0 = 2131362685(0x7f0a037d, float:1.8345158E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L3a
            r0 = 2131362686(0x7f0a037e, float:1.834516E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L3a
            jd.x r0 = new jd.x
            r3 = r8
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L3a:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    /* renamed from: d */
    public static p171jd.C3570x m8012d(android.view.LayoutInflater r6, android.view.ViewGroup r7, boolean r8) {
            r0 = 2131558604(0x7f0d00cc, float:1.8742529E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r7, r1)
            if (r8 == 0) goto Ld
            r7.addView(r6)
        Ld:
            r7 = 2131361964(0x7f0a00ac, float:1.8343695E38)
            android.view.View r8 = p064e.C1494h.m4055f(r6, r7)
            r2 = r8
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            if (r2 == 0) goto L47
            r7 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r8 = p064e.C1494h.m4055f(r6, r7)
            r3 = r8
            com.google.android.material.imageview.ShapeableImageView r3 = (com.google.android.material.imageview.ShapeableImageView) r3
            if (r3 == 0) goto L47
            r7 = 2131362637(0x7f0a034d, float:1.834506E38)
            android.view.View r8 = p064e.C1494h.m4055f(r6, r7)
            r4 = r8
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L47
            r7 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r8 = p064e.C1494h.m4055f(r6, r7)
            r5 = r8
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L47
            jd.x r7 = new jd.x
            r1 = r6
            com.google.android.material.card.MaterialCardView r1 = (com.google.android.material.card.MaterialCardView) r1
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L47:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r7)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Missing required view with ID: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15626a
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1e;
                case 2: goto L19;
                case 3: goto Lb;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L31
        L6:
            com.google.android.material.card.MaterialCardView r0 = r1.m8013c()
            return r0
        Lb:
            switch(r0) {
                case 1: goto Lf;
                default: goto Le;
            }
        Le:
            goto L14
        Lf:
            java.lang.Object r0 = r1.f15627b
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L18
        L14:
            java.lang.Object r0 = r1.f15627b
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L18:
            return r0
        L19:
            com.google.android.material.card.MaterialCardView r0 = r1.m8013c()
            return r0
        L1e:
            switch(r0) {
                case 1: goto L22;
                default: goto L21;
            }
        L21:
            goto L27
        L22:
            java.lang.Object r0 = r1.f15627b
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L2b
        L27:
            java.lang.Object r0 = r1.f15627b
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L2b:
            return r0
        L2c:
            java.lang.Object r0 = r1.f15627b
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            return r0
        L31:
            com.google.android.material.card.MaterialCardView r0 = r1.m8013c()
            return r0
    }

    /* renamed from: c */
    public com.google.android.material.card.MaterialCardView m8013c() {
            r1 = this;
            int r0 = r1.f15626a
            switch(r0) {
                case 2: goto Lb;
                case 3: goto L5;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r1.f15627b
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            return r0
        Lb:
            java.lang.Object r0 = r1.f15627b
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            return r0
        L10:
            java.lang.Object r0 = r1.f15627b
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            return r0
    }
}
