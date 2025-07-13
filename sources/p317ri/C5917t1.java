package p317ri;

/* renamed from: ri.t1 */
/* loaded from: classes.dex */
public class C5917t1 extends p317ri.AbstractC5915t {

    /* renamed from: Z */
    public byte[] f22745Z;

    public C5917t1(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22745Z = r1
            return
    }

    @Override // p317ri.AbstractC5915t, p317ri.AbstractC5912s
    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r1 = this;
            byte[] r0 = r1.f22745Z
            if (r0 == 0) goto L7
            r1.m12280K()
        L7:
            ri.s r0 = super.mo12209A()
            return r0
    }

    @Override // p317ri.AbstractC5915t
    /* renamed from: F */
    public synchronized p317ri.InterfaceC5870e mo12277F(int r2) {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.f22745Z     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L8
            r1.m12280K()     // Catch: java.lang.Throwable -> L12
        L8:
            java.util.Vector r0 = r1.f22743Y     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.elementAt(r2)     // Catch: java.lang.Throwable -> L12
            ri.e r2 = (p317ri.InterfaceC5870e) r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p317ri.AbstractC5915t
    /* renamed from: H */
    public synchronized java.util.Enumeration mo12278H() {
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.f22745Z     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lb
            java.util.Enumeration r0 = super.mo12278H()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r0
        Lb:
            ri.s1 r1 = new ri.s1     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r1
        L12:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: K */
    public final void m12280K() {
            r3 = this;
            ri.s1 r0 = new ri.s1
            byte[] r1 = r3.f22745Z
            r0.<init>(r1)
        L7:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L17
            java.util.Vector r1 = r3.f22743Y
            java.lang.Object r2 = r0.nextElement()
            r1.addElement(r2)
            goto L7
        L17:
            r0 = 0
            r3.f22745Z = r0
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22745Z
            if (r0 == 0) goto La
            r1 = 48
            r3.m12266e(r1, r0)
            goto L11
        La:
            ri.s r0 = super.mo12209A()
            r0.mo12204p(r3)
        L11:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22745Z
            if (r0 == 0) goto L10
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22745Z
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
        L10:
            ri.s r0 = super.mo12209A()
            int r0 = r0.mo12205q()
            return r0
    }

    @Override // p317ri.AbstractC5915t
    public synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.f22745Z     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L8
            r1.m12280K()     // Catch: java.lang.Throwable -> Le
        L8:
            int r0 = super.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p317ri.AbstractC5915t, p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r1 = this;
            byte[] r0 = r1.f22745Z
            if (r0 == 0) goto L7
            r1.m12280K()
        L7:
            ri.s r0 = super.mo12212z()
            return r0
    }
}
