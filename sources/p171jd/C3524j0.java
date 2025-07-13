package p171jd;

/* renamed from: jd.j0 */
/* loaded from: classes.dex */
public final class C3524j0 implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15246a;

    /* renamed from: b */
    public final androidx.appcompat.widget.LinearLayoutCompat f15247b;

    /* renamed from: c */
    public final androidx.appcompat.widget.AppCompatImageView f15248c;

    /* renamed from: d */
    public final androidx.appcompat.widget.AppCompatTextView f15249d;

    /* renamed from: e */
    public final androidx.appcompat.widget.AppCompatTextView f15250e;

    public C3524j0(androidx.appcompat.widget.LinearLayoutCompat r2, androidx.appcompat.widget.AppCompatImageView r3, androidx.appcompat.widget.AppCompatTextView r4, androidx.appcompat.widget.AppCompatTextView r5, int r6) {
            r1 = this;
            r1.f15246a = r6
            r0 = 1
            if (r6 == r0) goto L11
            r1.<init>()
            r1.f15247b = r2
            r1.f15248c = r3
            r1.f15249d = r4
            r1.f15250e = r5
            return
        L11:
            r1.<init>()
            r1.f15247b = r2
            r1.f15248c = r3
            r1.f15249d = r4
            r1.f15250e = r5
            return
    }

    /* renamed from: a */
    public static p171jd.C3524j0 m7993a(android.view.View r8) {
            r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L2f
            r0 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L2f
            r0 = 2131362748(0x7f0a03bc, float:1.8345285E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L2f
            jd.j0 r0 = new jd.j0
            r3 = r8
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L2f:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    /* renamed from: c */
    public static p171jd.C3524j0 m7994c(android.view.View r8) {
            r0 = 2131362253(0x7f0a01cd, float:1.8344281E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L2f
            r0 = 2131362282(0x7f0a01ea, float:1.834434E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L2f
            r0 = 2131362748(0x7f0a03bc, float:1.8345285E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L2f
            jd.j0 r0 = new jd.j0
            r3 = r8
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r7 = 1
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L2f:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15246a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7995d()
            return r0
        Lb:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7995d()
            return r0
    }

    /* renamed from: d */
    public androidx.appcompat.widget.LinearLayoutCompat m7995d() {
            r1 = this;
            int r0 = r1.f15246a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L9
        L6:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.f15247b
            return r0
        L9:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.f15247b
            return r0
    }
}
