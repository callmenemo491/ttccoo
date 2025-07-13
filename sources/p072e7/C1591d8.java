package p072e7;

/* renamed from: e7.d8 */
/* loaded from: classes.dex */
public final class C1591d8 implements java.util.Iterator<java.lang.String> {

    /* renamed from: Y */
    public final /* synthetic */ int f7537Y;

    /* renamed from: Z */
    public final java.util.Iterator<java.lang.String> f7538Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f7539a0;

    public C1591d8(p072e7.C1601e8 r2) {
            r1 = this;
            r0 = 0
            r1.f7537Y = r0
            r1.f7539a0 = r2
            r1.<init>()
            e7.l6 r2 = r2.f7551Y
            java.util.Iterator r2 = r2.iterator()
            r1.f7538Z = r2
            return
    }

    public C1591d8(p124h7.C2972z0 r2) {
            r1 = this;
            r0 = 1
            r1.f7537Y = r0
            r1.f7539a0 = r2
            r1.<init>()
            h7.j r2 = r2.f12046Y
            java.util.Iterator r2 = r2.iterator()
            r1.f7538Z = r2
            return
    }

    public C1591d8(p185k7.C3803f8 r2) {
            r1 = this;
            r0 = 2
            r1.f7537Y = r0
            r1.f7539a0 = r2
            r1.<init>()
            k7.q6 r2 = r2.f16637Y
            java.util.Iterator r2 = r2.iterator()
            r1.f7538Z = r2
            return
    }

    public C1591d8(p249o7.C5061o r2) {
            r1 = this;
            r0 = 3
            r1.f7537Y = r0
            r1.f7539a0 = r2
            r1.<init>()
            android.os.Bundle r2 = r2.f19913Y
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
            r1.f7538Z = r2
            return
    }

    /* renamed from: a */
    public java.lang.String m4181a() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f7537Y
            switch(r0) {
                case 0: goto L14;
                case 1: goto Ld;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L1b
        L6:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            boolean r0 = r0.hasNext()
            return r0
        Ld:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            boolean r0 = r0.hasNext()
            return r0
        L14:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            boolean r0 = r0.hasNext()
            return r0
        L1b:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.String next() {
            r1 = this;
            int r0 = r1.f7537Y
            switch(r0) {
                case 0: goto L18;
                case 1: goto Lf;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L21
        L6:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Lf:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L18:
            java.util.Iterator<java.lang.String> r0 = r1.f7538Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L21:
            java.lang.String r0 = r1.m4181a()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f7537Y
            switch(r0) {
                case 0: goto L12;
                case 1: goto Lc;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L12:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L18:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Remove not supported"
            r0.<init>(r1)
            throw r0
    }
}
