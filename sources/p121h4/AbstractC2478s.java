package p121h4;

/* renamed from: h4.s */
/* loaded from: classes.dex */
public abstract class AbstractC2478s implements p121h4.InterfaceC2465f {

    /* renamed from: b */
    public p121h4.InterfaceC2465f.a f11115b;

    /* renamed from: c */
    public p121h4.InterfaceC2465f.a f11116c;

    /* renamed from: d */
    public p121h4.InterfaceC2465f.a f11117d;

    /* renamed from: e */
    public p121h4.InterfaceC2465f.a f11118e;

    /* renamed from: f */
    public java.nio.ByteBuffer f11119f;

    /* renamed from: g */
    public java.nio.ByteBuffer f11120g;

    /* renamed from: h */
    public boolean f11121h;

    public AbstractC2478s() {
            r1 = this;
            r1.<init>()
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r1.f11119f = r0
            r1.f11120g = r0
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
            r1.f11117d = r0
            r1.f11118e = r0
            r1.f11115b = r0
            r1.f11116c = r0
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: a */
    public boolean mo6240a() {
            r2 = this;
            h4.f$a r0 = r2.f11118e
            h4.f$a r1 = p121h4.InterfaceC2465f.a.f11037e
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: b */
    public final void mo6257b() {
            r1 = this;
            r1.flush()
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r1.f11119f = r0
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
            r1.f11117d = r0
            r1.f11118e = r0
            r1.f11115b = r0
            r1.f11116c = r0
            r1.mo6243k()
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: c */
    public java.nio.ByteBuffer mo6258c() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f11120g
            java.nio.ByteBuffer r1 = p121h4.InterfaceC2465f.f11036a
            r2.f11120g = r1
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: d */
    public boolean mo6259d() {
            r2 = this;
            boolean r0 = r2.f11121h
            if (r0 == 0) goto Lc
            java.nio.ByteBuffer r0 = r2.f11120g
            java.nio.ByteBuffer r1 = p121h4.InterfaceC2465f.f11036a
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: e */
    public final void mo6260e() {
            r1 = this;
            r0 = 1
            r1.f11121h = r0
            r1.mo6242j()
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: f */
    public final p121h4.InterfaceC2465f.a mo6261f(p121h4.InterfaceC2465f.a r1) {
            r0 = this;
            r0.f11117d = r1
            h4.f$a r1 = r0.mo6238h(r1)
            r0.f11118e = r1
            boolean r1 = r0.mo6240a()
            if (r1 == 0) goto L11
            h4.f$a r1 = r0.f11118e
            goto L13
        L11:
            h4.f$a r1 = p121h4.InterfaceC2465f.a.f11037e
        L13:
            return r1
    }

    @Override // p121h4.InterfaceC2465f
    public final void flush() {
            r1 = this;
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r1.f11120g = r0
            r0 = 0
            r1.f11121h = r0
            h4.f$a r0 = r1.f11117d
            r1.f11115b = r0
            h4.f$a r0 = r1.f11118e
            r1.f11116c = r0
            r1.mo6241i()
            return
    }

    /* renamed from: h */
    public abstract p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r1);

    /* renamed from: i */
    public void mo6241i() {
            r0 = this;
            return
    }

    /* renamed from: j */
    public void mo6242j() {
            r0 = this;
            return
    }

    /* renamed from: k */
    public void mo6243k() {
            r0 = this;
            return
    }

    /* renamed from: l */
    public final java.nio.ByteBuffer m6300l(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f11119f
            int r0 = r0.capacity()
            if (r0 >= r2) goto L17
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r0)
            r1.f11119f = r2
            goto L1c
        L17:
            java.nio.ByteBuffer r2 = r1.f11119f
            r2.clear()
        L1c:
            java.nio.ByteBuffer r2 = r1.f11119f
            r1.f11120g = r2
            return r2
    }
}
