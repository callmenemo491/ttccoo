package p222mb;

/* renamed from: mb.m */
/* loaded from: classes.dex */
public final class C4522m<T> extends p169jb.AbstractC3483z<T> {

    /* renamed from: a */
    public final p169jb.InterfaceC3479v<T> f18362a;

    /* renamed from: b */
    public final p169jb.InterfaceC3472o<T> f18363b;

    /* renamed from: c */
    public final p169jb.C3467j f18364c;

    /* renamed from: d */
    public final p274pb.C5380a<T> f18365d;

    /* renamed from: e */
    public final p222mb.C4522m<T>.b f18366e;

    /* renamed from: f */
    public p169jb.AbstractC3483z<T> f18367f;

    /* renamed from: mb.m$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: mb.m$b */
    public final class b implements p169jb.InterfaceC3478u, p169jb.InterfaceC3471n {
        public b(p222mb.C4522m r1, p222mb.C4522m.a r2) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C4522m(p169jb.InterfaceC3479v<T> r2, p169jb.InterfaceC3472o<T> r3, p169jb.C3467j r4, p274pb.C5380a<T> r5, p169jb.InterfaceC3458a0 r6) {
            r1 = this;
            r1.<init>()
            mb.m$b r6 = new mb.m$b
            r0 = 0
            r6.<init>(r1, r0)
            r1.f18366e = r6
            r1.f18362a = r2
            r1.f18363b = r3
            r1.f18364c = r4
            r1.f18365d = r5
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public T mo7919a(p290qb.C5612a r4) {
            r3 = this;
            jb.o<T> r0 = r3.f18363b
            r1 = 0
            if (r0 != 0) goto L19
            jb.z<T> r0 = r3.f18367f
            if (r0 == 0) goto La
            goto L14
        La:
            jb.j r0 = r3.f18364c
            pb.a<T> r2 = r3.f18365d
            jb.z r0 = r0.m7932f(r1, r2)
            r3.f18367f = r0
        L14:
            java.lang.Object r4 = r0.mo7919a(r4)
            return r4
        L19:
            r4.mo10414z0()     // Catch: java.lang.NumberFormatException -> L28 java.io.IOException -> L2f p290qb.C5615d -> L36 java.io.EOFException -> L3d
            r0 = 0
            jb.z<jb.p> r2 = p222mb.C4524o.f18373C     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f p290qb.C5615d -> L36
            mb.o$u r2 = (p222mb.C4524o.u) r2     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f p290qb.C5615d -> L36
            jb.p r4 = r2.m10432c(r4)     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f p290qb.C5615d -> L36
            goto L43
        L26:
            r4 = move-exception
            goto L3f
        L28:
            r4 = move-exception
            jb.w r0 = new jb.w
            r0.<init>(r4)
            throw r0
        L2f:
            r4 = move-exception
            jb.q r0 = new jb.q
            r0.<init>(r4)
            throw r0
        L36:
            r4 = move-exception
            jb.w r0 = new jb.w
            r0.<init>(r4)
            throw r0
        L3d:
            r4 = move-exception
            r0 = 1
        L3f:
            if (r0 == 0) goto L55
            jb.r r4 = p169jb.C3475r.f14967a
        L43:
            boolean r0 = r4 instanceof p169jb.C3475r
            if (r0 == 0) goto L48
            return r1
        L48:
            jb.o<T> r0 = r3.f18363b
            pb.a<T> r1 = r3.f18365d
            java.lang.reflect.Type r1 = r1.f21382b
            mb.m<T>$b r2 = r3.f18366e
            java.lang.Object r4 = r0.m7946a(r4, r1, r2)
            return r4
        L55:
            jb.w r0 = new jb.w
            r0.<init>(r4)
            throw r0
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r4, T r5) {
            r3 = this;
            jb.v<T> r0 = r3.f18362a
            if (r0 != 0) goto L18
            jb.z<T> r0 = r3.f18367f
            if (r0 == 0) goto L9
            goto L14
        L9:
            jb.j r0 = r3.f18364c
            r1 = 0
            pb.a<T> r2 = r3.f18365d
            jb.z r0 = r0.m7932f(r1, r2)
            r3.f18367f = r0
        L14:
            r0.mo7920b(r4, r5)
            return
        L18:
            if (r5 != 0) goto L1e
            r4.mo10417R()
            return
        L1e:
            pb.a<T> r1 = r3.f18365d
            java.lang.reflect.Type r1 = r1.f21382b
            mb.m<T>$b r2 = r3.f18366e
            jb.p r5 = r0.m7954a(r5, r1, r2)
            jb.z<jb.p> r0 = p222mb.C4524o.f18373C
            mb.o$u r0 = (p222mb.C4524o.u) r0
            r0.m10433d(r4, r5)
            return
    }
}
