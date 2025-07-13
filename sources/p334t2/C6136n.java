package p334t2;

/* renamed from: t2.n */
/* loaded from: classes.dex */
public class C6136n implements p180k2.InterfaceC3676h<android.graphics.drawable.Drawable> {

    /* renamed from: b */
    public final p180k2.InterfaceC3676h<android.graphics.Bitmap> f23695b;

    /* renamed from: c */
    public final boolean f23696c;

    public C6136n(p180k2.InterfaceC3676h<android.graphics.Bitmap> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f23695b = r1
            r0.f23696c = r2
            return
    }

    @Override // p180k2.InterfaceC3676h
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.drawable.Drawable> mo8134a(android.content.Context r3, p214m2.InterfaceC4345w<android.graphics.drawable.Drawable> r4, int r5, int r6) {
            r2 = this;
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r3)
            n2.c r0 = r0.f5097Y
            java.lang.Object r1 = r4.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            m2.w r0 = p334t2.C6135m.m12681a(r0, r1, r5, r6)
            if (r0 != 0) goto L33
            boolean r3 = r2.f23696c
            if (r3 != 0) goto L17
            return r4
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to convert "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " to a Bitmap"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L33:
            k2.h<android.graphics.Bitmap> r1 = r2.f23695b
            m2.w r5 = r1.mo8134a(r3, r0, r5, r6)
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L43
            r5.mo9721d()
            return r4
        L43:
            android.content.res.Resources r3 = r3.getResources()
            m2.w r3 = p334t2.C6126d.m12653e(r3, r5)
            return r3
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            k2.h<android.graphics.Bitmap> r0 = r1.f23695b
            r0.mo5082b(r2)
            return
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p334t2.C6136n
            if (r0 == 0) goto Lf
            t2.n r2 = (p334t2.C6136n) r2
            k2.h<android.graphics.Bitmap> r0 = r1.f23695b
            k2.h<android.graphics.Bitmap> r2 = r2.f23695b
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            k2.h<android.graphics.Bitmap> r0 = r1.f23695b
            int r0 = r0.hashCode()
            return r0
    }
}
