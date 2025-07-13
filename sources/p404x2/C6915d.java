package p404x2;

/* renamed from: x2.d */
/* loaded from: classes.dex */
public class C6915d implements p180k2.InterfaceC3676h<p404x2.C6914c> {

    /* renamed from: b */
    public final p180k2.InterfaceC3676h<android.graphics.Bitmap> f26914b;

    public C6915d(p180k2.InterfaceC3676h<android.graphics.Bitmap> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f26914b = r2
            return
    }

    @Override // p180k2.InterfaceC3676h
    /* renamed from: a */
    public p214m2.InterfaceC4345w<p404x2.C6914c> mo8134a(android.content.Context r5, p214m2.InterfaceC4345w<p404x2.C6914c> r6, int r7, int r8) {
            r4 = this;
            java.lang.Object r0 = r6.get()
            x2.c r0 = (p404x2.C6914c) r0
            com.bumptech.glide.c r1 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r5)
            n2.c r1 = r1.f5097Y
            android.graphics.Bitmap r2 = r0.m14020b()
            t2.d r3 = new t2.d
            r3.<init>(r2, r1)
            k2.h<android.graphics.Bitmap> r1 = r4.f26914b
            m2.w r5 = r1.mo8134a(r5, r3, r7, r8)
            boolean r7 = r3.equals(r5)
            if (r7 != 0) goto L24
            r3.mo9721d()
        L24:
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            k2.h<android.graphics.Bitmap> r7 = r4.f26914b
            x2.c$a r8 = r0.f26903Y
            x2.e r8 = r8.f26913a
            r8.m14026c(r7, r5)
            return r6
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            k2.h<android.graphics.Bitmap> r0 = r1.f26914b
            r0.mo5082b(r2)
            return
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p404x2.C6915d
            if (r0 == 0) goto Lf
            x2.d r2 = (p404x2.C6915d) r2
            k2.h<android.graphics.Bitmap> r0 = r1.f26914b
            k2.h<android.graphics.Bitmap> r2 = r2.f26914b
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            k2.h<android.graphics.Bitmap> r0 = r1.f26914b
            int r0 = r0.hashCode()
            return r0
    }
}
