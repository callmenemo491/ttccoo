package p334t2;

/* renamed from: t2.d */
/* loaded from: classes.dex */
public class C6126d implements p214m2.InterfaceC4345w<android.graphics.Bitmap>, p214m2.InterfaceC4342t {

    /* renamed from: Y */
    public final /* synthetic */ int f23662Y;

    /* renamed from: Z */
    public final java.lang.Object f23663Z;

    /* renamed from: a0 */
    public final java.lang.Object f23664a0;

    public C6126d(android.content.res.Resources r2, p214m2.InterfaceC4345w r3) {
            r1 = this;
            r0 = 1
            r1.f23662Y = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f23663Z = r2
            r1.f23664a0 = r3
            return
    }

    public C6126d(android.graphics.Bitmap r2, p229n2.InterfaceC4673c r3) {
            r1 = this;
            r0 = 0
            r1.f23662Y = r0
            r1.<init>()
            java.lang.String r0 = "Bitmap must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f23663Z = r2
            java.lang.String r2 = "BitmapPool must not be null"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f23664a0 = r3
            return
    }

    /* renamed from: e */
    public static p214m2.InterfaceC4345w<android.graphics.drawable.BitmapDrawable> m12653e(android.content.res.Resources r1, p214m2.InterfaceC4345w<android.graphics.Bitmap> r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            t2.d r0 = new t2.d
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: f */
    public static p334t2.C6126d m12654f(android.graphics.Bitmap r1, p229n2.InterfaceC4673c r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            t2.d r0 = new t2.d
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: a */
    public int mo9718a() {
            r1 = this;
            int r0 = r1.f23662Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            java.lang.Object r0 = r1.f23663Z
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = p106g3.C2238j.m5844d(r0)
            return r0
        Lf:
            java.lang.Object r0 = r1.f23664a0
            m2.w r0 = (p214m2.InterfaceC4345w) r0
            int r0 = r0.mo9718a()
            return r0
    }

    @Override // p214m2.InterfaceC4342t
    /* renamed from: b */
    public void mo9729b() {
            r2 = this;
            int r0 = r2.f23662Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r2.f23663Z
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.prepareToDraw()
            return
        Le:
            java.lang.Object r0 = r2.f23664a0
            m2.w r0 = (p214m2.InterfaceC4345w) r0
            boolean r1 = r0 instanceof p214m2.InterfaceC4342t
            if (r1 == 0) goto L1b
            m2.t r0 = (p214m2.InterfaceC4342t) r0
            r0.mo9729b()
        L1b:
            return
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: c */
    public java.lang.Class<android.graphics.Bitmap> mo9720c() {
            r1 = this;
            int r0 = r1.f23662Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L9
        L6:
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            return r0
        L9:
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: d */
    public void mo9721d() {
            r2 = this;
            int r0 = r2.f23662Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            java.lang.Object r0 = r2.f23664a0
            n2.c r0 = (p229n2.InterfaceC4673c) r0
            java.lang.Object r1 = r2.f23663Z
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.mo10694f(r1)
            return
        L12:
            java.lang.Object r0 = r2.f23664a0
            m2.w r0 = (p214m2.InterfaceC4345w) r0
            r0.mo9721d()
            return
    }

    @Override // p214m2.InterfaceC4345w
    public android.graphics.Bitmap get() {
            r3 = this;
            int r0 = r3.f23662Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            java.lang.Object r0 = r3.f23663Z
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        Lb:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            java.lang.Object r1 = r3.f23663Z
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.Object r2 = r3.f23664a0
            m2.w r2 = (p214m2.InterfaceC4345w) r2
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r1, r2)
            return r0
    }
}
