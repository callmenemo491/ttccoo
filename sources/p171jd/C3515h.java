package p171jd;

/* renamed from: jd.h */
/* loaded from: classes.dex */
public final class C3515h implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15193a;

    /* renamed from: b */
    public final java.lang.Object f15194b;

    /* renamed from: c */
    public final java.lang.Object f15195c;

    /* renamed from: d */
    public final java.lang.Object f15196d;

    public C3515h(android.widget.FrameLayout r2, androidx.appcompat.widget.AppCompatImageView r3, androidx.appcompat.widget.AppCompatImageView r4) {
            r1 = this;
            r0 = 2
            r1.f15193a = r0
            r1.<init>()
            r1.f15194b = r2
            r1.f15195c = r3
            r1.f15196d = r4
            return
    }

    public C3515h(androidx.appcompat.widget.LinearLayoutCompat r2, android.widget.ImageView r3, androidx.appcompat.widget.AppCompatTextView r4) {
            r1 = this;
            r0 = 5
            r1.f15193a = r0
            r1.<init>()
            r1.f15194b = r2
            r1.f15195c = r3
            r1.f15196d = r4
            return
    }

    public C3515h(androidx.appcompat.widget.LinearLayoutCompat r2, com.google.android.material.imageview.ShapeableImageView r3, androidx.appcompat.widget.AppCompatTextView r4) {
            r1 = this;
            r0 = 1
            r1.f15193a = r0
            r1.<init>()
            r1.f15194b = r2
            r1.f15195c = r3
            r1.f15196d = r4
            return
    }

    public C3515h(com.google.android.material.card.MaterialCardView r2, androidx.appcompat.widget.AppCompatImageView r3, androidx.appcompat.widget.AppCompatTextView r4) {
            r1 = this;
            r0 = 0
            r1.f15193a = r0
            r1.<init>()
            r1.f15194b = r2
            r1.f15195c = r3
            r1.f15196d = r4
            return
    }

    public C3515h(com.google.android.material.card.MaterialCardView r2, p171jd.C3531l r3, p171jd.C3531l r4) {
            r1 = this;
            r0 = 3
            r1.f15193a = r0
            r1.<init>()
            r1.f15194b = r2
            r1.f15195c = r3
            r1.f15196d = r4
            return
    }

    /* renamed from: a */
    public static p171jd.C3515h m7984a(android.view.View r3) {
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r3, r0)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            if (r1 == 0) goto L1e
            r0 = 2131362684(0x7f0a037c, float:1.8345156E38)
            android.view.View r2 = p064e.C1494h.m4055f(r3, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L1e
            jd.h r0 = new jd.h
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r0.<init>(r3, r1, r2)
            return r0
        L1e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: c */
    public static p171jd.C3515h m7985c(android.view.View r3) {
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r3, r0)
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            if (r1 == 0) goto L1e
            r0 = 2131362671(0x7f0a036f, float:1.834513E38)
            android.view.View r2 = p064e.C1494h.m4055f(r3, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L1e
            jd.h r0 = new jd.h
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r0.<init>(r3, r1, r2)
            return r0
        L1e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: d */
    public static p171jd.C3515h m7986d(android.view.View r3) {
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r3, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L1e
            r0 = 2131362684(0x7f0a037c, float:1.8345156E38)
            android.view.View r2 = p064e.C1494h.m4055f(r3, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L1e
            jd.h r0 = new jd.h
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r0.<init>(r3, r1, r2)
            return r0
        L1e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15193a
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L15;
                case 2: goto L10;
                case 3: goto Lb;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L1f
        L6:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7987e()
            return r0
        Lb:
            com.google.android.material.card.MaterialCardView r0 = r1.m7988f()
            return r0
        L10:
            java.lang.Object r0 = r1.f15194b
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            return r0
        L15:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7987e()
            return r0
        L1a:
            com.google.android.material.card.MaterialCardView r0 = r1.m7988f()
            return r0
        L1f:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7987e()
            return r0
    }

    /* renamed from: e */
    public androidx.appcompat.widget.LinearLayoutCompat m7987e() {
            r1 = this;
            int r0 = r1.f15193a
            switch(r0) {
                case 1: goto Lb;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r1.f15194b
            androidx.appcompat.widget.LinearLayoutCompat r0 = (androidx.appcompat.widget.LinearLayoutCompat) r0
            return r0
        Lb:
            java.lang.Object r0 = r1.f15194b
            androidx.appcompat.widget.LinearLayoutCompat r0 = (androidx.appcompat.widget.LinearLayoutCompat) r0
            return r0
        L10:
            java.lang.Object r0 = r1.f15194b
            androidx.appcompat.widget.LinearLayoutCompat r0 = (androidx.appcompat.widget.LinearLayoutCompat) r0
            return r0
    }

    /* renamed from: f */
    public com.google.android.material.card.MaterialCardView m7988f() {
            r1 = this;
            int r0 = r1.f15193a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            java.lang.Object r0 = r1.f15194b
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            return r0
        Lb:
            java.lang.Object r0 = r1.f15194b
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            return r0
    }
}
