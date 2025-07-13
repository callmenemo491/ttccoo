package p334t2;

/* renamed from: t2.e */
/* loaded from: classes.dex */
public abstract class AbstractC6127e implements p180k2.InterfaceC3676h<android.graphics.Bitmap> {
    public AbstractC6127e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p180k2.InterfaceC3676h
    /* renamed from: a */
    public final p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8134a(android.content.Context r3, p214m2.InterfaceC4345w<android.graphics.Bitmap> r4, int r5, int r6) {
            r2 = this;
            boolean r0 = p106g3.C2238j.m5850j(r5, r6)
            if (r0 == 0) goto L30
            com.bumptech.glide.c r3 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r3)
            n2.c r3 = r3.f5097Y
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L1a
            int r5 = r0.getWidth()
        L1a:
            if (r6 != r1) goto L20
            int r6 = r0.getHeight()
        L20:
            android.graphics.Bitmap r5 = r2.mo12655c(r3, r0, r5, r6)
            boolean r6 = r0.equals(r5)
            if (r6 == 0) goto L2b
            goto L2f
        L2b:
            t2.d r4 = p334t2.C6126d.m12654f(r5, r3)
        L2f:
            return r4
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Cannot apply transformation on width: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " or height: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: c */
    public abstract android.graphics.Bitmap mo12655c(p229n2.InterfaceC4673c r1, android.graphics.Bitmap r2, int r3, int r4);
}
