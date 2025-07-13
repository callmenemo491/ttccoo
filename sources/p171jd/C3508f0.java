package p171jd;

/* renamed from: jd.f0 */
/* loaded from: classes.dex */
public final class C3508f0 implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15142a;

    /* renamed from: b */
    public final androidx.appcompat.widget.LinearLayoutCompat f15143b;

    /* renamed from: c */
    public final androidx.appcompat.widget.AppCompatTextView f15144c;

    /* renamed from: d */
    public final androidx.appcompat.widget.AppCompatTextView f15145d;

    public C3508f0(androidx.appcompat.widget.LinearLayoutCompat r2, androidx.appcompat.widget.AppCompatTextView r3, androidx.appcompat.widget.AppCompatTextView r4, int r5) {
            r1 = this;
            r1.f15142a = r5
            r0 = 1
            if (r5 == r0) goto L1c
            r0 = 2
            if (r5 == r0) goto L12
            r1.<init>()
            r1.f15143b = r2
            r1.f15144c = r3
            r1.f15145d = r4
            return
        L12:
            r1.<init>()
            r1.f15143b = r2
            r1.f15144c = r3
            r1.f15145d = r4
            return
        L1c:
            r1.<init>()
            r1.f15143b = r2
            r1.f15144c = r3
            r1.f15145d = r4
            return
    }

    /* renamed from: a */
    public static p171jd.C3508f0 m7979a(android.view.View r4) {
            r0 = 2131362286(0x7f0a01ee, float:1.8344348E38)
            android.view.View r1 = p064e.C1494h.m4055f(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L1f
            r0 = 2131362748(0x7f0a03bc, float:1.8345285E38)
            android.view.View r2 = p064e.C1494h.m4055f(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L1f
            jd.f0 r0 = new jd.f0
            androidx.appcompat.widget.LinearLayoutCompat r4 = (androidx.appcompat.widget.LinearLayoutCompat) r4
            r3 = 1
            r0.<init>(r4, r1, r2, r3)
            return r0
        L1f:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: c */
    public static p171jd.C3508f0 m7980c(android.view.View r4) {
            r0 = 2131362282(0x7f0a01ea, float:1.834434E38)
            android.view.View r1 = p064e.C1494h.m4055f(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L1f
            r0 = 2131362748(0x7f0a03bc, float:1.8345285E38)
            android.view.View r2 = p064e.C1494h.m4055f(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L1f
            jd.f0 r0 = new jd.f0
            androidx.appcompat.widget.LinearLayoutCompat r4 = (androidx.appcompat.widget.LinearLayoutCompat) r4
            r3 = 2
            r0.<init>(r4, r1, r2, r3)
            return r0
        L1f:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15142a
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7981d()
            return r0
        Lb:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7981d()
            return r0
        L10:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.m7981d()
            return r0
    }

    /* renamed from: d */
    public androidx.appcompat.widget.LinearLayoutCompat m7981d() {
            r1 = this;
            int r0 = r1.f15142a
            switch(r0) {
                case 0: goto L9;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.f15143b
            return r0
        L9:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.f15143b
            return r0
        Lc:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.f15143b
            return r0
    }
}
