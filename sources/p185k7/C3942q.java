package p185k7;

/* renamed from: k7.q */
/* loaded from: classes.dex */
public final class C3942q implements java.util.Iterator<p185k7.InterfaceC3916o> {

    /* renamed from: Y */
    public final /* synthetic */ int f16839Y;

    /* renamed from: Z */
    public int f16840Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f16841a0;

    public C3942q(p185k7.C3766d r2) {
            r1 = this;
            r0 = 2
            r1.f16839Y = r0
            r1.f16841a0 = r2
            r1.<init>()
            r2 = 0
            r1.f16840Z = r2
            return
    }

    public C3942q(p185k7.C3955r r3, int r4) {
            r2 = this;
            r2.f16839Y = r4
            r0 = 0
            r1 = 1
            if (r4 == r1) goto Le
            r2.f16841a0 = r3
            r2.<init>()
            r2.f16840Z = r0
            return
        Le:
            r2.f16841a0 = r3
            r2.<init>()
            r2.f16840Z = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f16839Y
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L18;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L28
        L8:
            int r0 = r4.f16840Z
            java.lang.Object r3 = r4.f16841a0
            k7.r r3 = (p185k7.C3955r) r3
            java.lang.String r3 = r3.f16850Y
            int r3 = r3.length()
            if (r0 >= r3) goto L17
            r1 = 1
        L17:
            return r1
        L18:
            int r0 = r4.f16840Z
            java.lang.Object r3 = r4.f16841a0
            k7.r r3 = (p185k7.C3955r) r3
            java.lang.String r3 = r3.f16850Y
            int r3 = r3.length()
            if (r0 >= r3) goto L27
            r1 = 1
        L27:
            return r1
        L28:
            int r0 = r4.f16840Z
            java.lang.Object r3 = r4.f16841a0
            k7.d r3 = (p185k7.C3766d) r3
            int r3 = r3.m8359m()
            if (r0 >= r3) goto L35
            r1 = 1
        L35:
            return r1
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3916o next() {
            r4 = this;
            int r0 = r4.f16839Y
            switch(r0) {
                case 0: goto L34;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L58
        L6:
            int r0 = r4.f16840Z
            java.lang.Object r1 = r4.f16841a0
            k7.r r1 = (p185k7.C3955r) r1
            java.lang.String r1 = r1.f16850Y
            int r1 = r1.length()
            if (r0 >= r1) goto L2e
            k7.r r0 = new k7.r
            java.lang.Object r1 = r4.f16841a0
            k7.r r1 = (p185k7.C3955r) r1
            java.lang.String r1 = r1.f16850Y
            int r2 = r4.f16840Z
            int r3 = r2 + 1
            r4.f16840Z = r3
            char r1 = r1.charAt(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
        L2e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L34:
            int r0 = r4.f16840Z
            java.lang.Object r1 = r4.f16841a0
            k7.r r1 = (p185k7.C3955r) r1
            java.lang.String r1 = r1.f16850Y
            int r1 = r1.length()
            if (r0 >= r1) goto L52
            k7.r r0 = new k7.r
            int r1 = r4.f16840Z
            int r2 = r1 + 1
            r4.f16840Z = r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
        L52:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L58:
            int r0 = r4.f16840Z
            java.lang.Object r1 = r4.f16841a0
            k7.d r1 = (p185k7.C3766d) r1
            int r1 = r1.m8359m()
            if (r0 >= r1) goto L73
            java.lang.Object r0 = r4.f16841a0
            k7.d r0 = (p185k7.C3766d) r0
            int r1 = r4.f16840Z
            int r2 = r1 + 1
            r4.f16840Z = r2
            k7.o r0 = r0.m8362q(r1)
            return r0
        L73:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            int r1 = r4.f16840Z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 32
            r2.<init>(r3)
            java.lang.String r3 = "Out of bounds index: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }
}
