package p368v2;

/* renamed from: v2.c */
/* loaded from: classes.dex */
public class C6494c extends p368v2.AbstractC6493b<android.graphics.drawable.Drawable> {

    /* renamed from: Z */
    public final /* synthetic */ int f25177Z;

    public C6494c(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f25177Z = r0
            r1.<init>(r2)
            return
    }

    public C6494c(p404x2.C6914c r2) {
            r1 = this;
            r0 = 1
            r1.f25177Z = r0
            r1.<init>(r2)
            return
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: a */
    public int mo9718a() {
            r2 = this;
            int r0 = r2.f25177Z
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L1c
        L6:
            T extends android.graphics.drawable.Drawable r0 = r2.f25176Y
            int r0 = r0.getIntrinsicWidth()
            T extends android.graphics.drawable.Drawable r1 = r2.f25176Y
            int r1 = r1.getIntrinsicHeight()
            int r1 = r1 * r0
            int r1 = r1 * 4
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L1c:
            T extends android.graphics.drawable.Drawable r0 = r2.f25176Y
            x2.c r0 = (p404x2.C6914c) r0
            x2.c$a r0 = r0.f26903Y
            x2.e r0 = r0.f26913a
            j2.a r1 = r0.f26915a
            int r1 = r1.mo7764f()
            int r0 = r0.f26929o
            int r1 = r1 + r0
            return r1
    }

    @Override // p368v2.AbstractC6493b, p214m2.InterfaceC4342t
    /* renamed from: b */
    public void mo9729b() {
            r1 = this;
            int r0 = r1.f25177Z
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.mo9729b()
            return
        L9:
            T extends android.graphics.drawable.Drawable r0 = r1.f25176Y
            x2.c r0 = (p404x2.C6914c) r0
            android.graphics.Bitmap r0 = r0.m14020b()
            r0.prepareToDraw()
            return
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: c */
    public java.lang.Class mo9720c() {
            r1 = this;
            int r0 = r1.f25177Z
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            T extends android.graphics.drawable.Drawable r0 = r1.f25176Y
            java.lang.Class r0 = r0.getClass()
            return r0
        Ld:
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: d */
    public void mo9721d() {
            r5 = this;
            int r0 = r5.f25177Z
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L7
        L6:
            return
        L7:
            T extends android.graphics.drawable.Drawable r0 = r5.f25176Y
            x2.c r0 = (p404x2.C6914c) r0
            r0.stop()
            T extends android.graphics.drawable.Drawable r0 = r5.f25176Y
            x2.c r0 = (p404x2.C6914c) r0
            r1 = 1
            r0.f26906b0 = r1
            x2.c$a r0 = r0.f26903Y
            x2.e r0 = r0.f26913a
            java.util.List<x2.e$b> r2 = r0.f26917c
            r2.clear()
            android.graphics.Bitmap r2 = r0.f26926l
            r3 = 0
            if (r2 == 0) goto L2a
            n2.c r4 = r0.f26919e
            r4.mo10694f(r2)
            r0.f26926l = r3
        L2a:
            r2 = 0
            r0.f26920f = r2
            x2.e$a r2 = r0.f26923i
            if (r2 == 0) goto L38
            com.bumptech.glide.j r4 = r0.f26918d
            r4.m2769r(r2)
            r0.f26923i = r3
        L38:
            x2.e$a r2 = r0.f26925k
            if (r2 == 0) goto L43
            com.bumptech.glide.j r4 = r0.f26918d
            r4.m2769r(r2)
            r0.f26925k = r3
        L43:
            x2.e$a r2 = r0.f26928n
            if (r2 == 0) goto L4e
            com.bumptech.glide.j r4 = r0.f26918d
            r4.m2769r(r2)
            r0.f26928n = r3
        L4e:
            j2.a r2 = r0.f26915a
            r2.clear()
            r0.f26924j = r1
            return
    }
}
