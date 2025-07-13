package p124h7;

import p124h7.AbstractC2970yg;
import p124h7.C2916vg;

/* renamed from: h7.yg */
/* loaded from: classes.dex */
public abstract class AbstractC2970yg<MessageType extends p124h7.AbstractC2970yg<MessageType, BuilderType>, BuilderType extends p124h7.C2916vg<MessageType, BuilderType>> extends p124h7.AbstractC2861sf<MessageType, BuilderType> {
    private static final java.util.Map<java.lang.Object, p124h7.AbstractC2970yg<?, ?>> zzb = null;
    public p124h7.C2936x0 zzc;
    public int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.AbstractC2970yg.zzb = r0
            return
    }

    public AbstractC2970yg() {
            r1 = this;
            r1.<init>()
            h7.x0 r0 = p124h7.C2936x0.f12011f
            r1.zzc = r0
            r0 = -1
            r1.zzd = r0
            return
    }

    /* renamed from: c */
    public static java.lang.Object m7328c(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: d */
    public static <T extends p124h7.AbstractC2970yg> void m7329d(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, h7.yg<?, ?>> r0 = p124h7.AbstractC2970yg.zzb
            r0.put(r1, r2)
            return
    }

    /* renamed from: g */
    public static <T extends p124h7.AbstractC2970yg<T, ?>> T m7330g(T r1) {
            boolean r0 = r1.m7335f()
            if (r0 == 0) goto L7
            return r1
        L7:
            h7.u0 r1 = new h7.u0
            r0 = 0
            r1.<init>(r0)
            h7.f r0 = new h7.f
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: j */
    public static <T extends p124h7.AbstractC2970yg> T m7331j(java.lang.Class<T> r4) {
            java.util.Map<java.lang.Object, h7.yg<?, ?>> r0 = p124h7.AbstractC2970yg.zzb
            java.lang.Object r1 = r0.get(r4)
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            r2 = 1
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = p124h7.C2577d1.m6549i(r4)
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.mo6484h(r2, r3, r3)
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            if (r1 == 0) goto L3c
            r0.put(r4, r1)
            goto L42
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L42:
            return r1
    }

    /* renamed from: l */
    public static <T extends p124h7.AbstractC2970yg<T, ?>> T m7332l(T r2, p124h7.AbstractC2574cg r3, p124h7.C2754mg r4) {
            h7.dg r3 = r3.mo6515n()     // Catch: p124h7.C2611f -> L59
            r0 = 4
            r1 = 0
            java.lang.Object r2 = r2.mo6484h(r0, r1, r1)     // Catch: p124h7.C2611f -> L59
            h7.yg r2 = (p124h7.AbstractC2970yg) r2     // Catch: p124h7.C2611f -> L59
            h7.f0 r0 = p124h7.C2612f0.f11504c     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            h7.i0 r0 = r0.m6688a(r1)     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            h7.eg r1 = r3.f11469b     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            if (r1 == 0) goto L1b
            goto L20
        L1b:
            h7.eg r1 = new h7.eg     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
        L20:
            r0.mo6444g(r2, r1, r4)     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            r0.mo6440c(r2)     // Catch: java.lang.RuntimeException -> L30 java.io.IOException -> L41 p124h7.C2611f -> L57
            r4 = 0
            r3.m6628i(r4)     // Catch: p124h7.C2611f -> L2e
            m7330g(r2)
            return r2
        L2e:
            r2 = move-exception
            throw r2     // Catch: p124h7.C2611f -> L59
        L30:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()     // Catch: p124h7.C2611f -> L59
            boolean r3 = r3 instanceof p124h7.C2611f     // Catch: p124h7.C2611f -> L59
            if (r3 == 0) goto L40
            java.lang.Throwable r2 = r2.getCause()     // Catch: p124h7.C2611f -> L59
            h7.f r2 = (p124h7.C2611f) r2     // Catch: p124h7.C2611f -> L59
            throw r2     // Catch: p124h7.C2611f -> L59
        L40:
            throw r2     // Catch: p124h7.C2611f -> L59
        L41:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()     // Catch: p124h7.C2611f -> L59
            boolean r3 = r3 instanceof p124h7.C2611f     // Catch: p124h7.C2611f -> L59
            if (r3 == 0) goto L51
            java.lang.Throwable r2 = r2.getCause()     // Catch: p124h7.C2611f -> L59
            h7.f r2 = (p124h7.C2611f) r2     // Catch: p124h7.C2611f -> L59
            throw r2     // Catch: p124h7.C2611f -> L59
        L51:
            h7.f r3 = new h7.f     // Catch: p124h7.C2611f -> L59
            r3.<init>(r2)     // Catch: p124h7.C2611f -> L59
            throw r3     // Catch: p124h7.C2611f -> L59
        L57:
            r2 = move-exception
            throw r2     // Catch: p124h7.C2611f -> L59
        L59:
            r2 = move-exception
            throw r2
    }

    /* renamed from: n */
    public static <T extends p124h7.AbstractC2970yg<T, ?>> T m7333n(T r7, byte[] r8, p124h7.C2754mg r9) {
            int r4 = r8.length
            r0 = 4
            r1 = 0
            java.lang.Object r7 = r7.mo6484h(r0, r1, r1)
            h7.yg r7 = (p124h7.AbstractC2970yg) r7
            h7.f0 r0 = p124h7.C2612f0.f11504c     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            h7.i0 r6 = r0.m6688a(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            h7.vf r5 = new h7.vf     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            r5.<init>(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.mo6446i(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            r6.mo6440c(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            int r8 = r7.zza     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            if (r8 != 0) goto L2a
            m7330g(r7)
            return r7
        L2a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
            throw r7     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35 p124h7.C2611f -> L4b
        L30:
            h7.f r7 = p124h7.C2611f.m6687g()
            throw r7
        L35:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof p124h7.C2611f
            if (r8 == 0) goto L45
            java.lang.Throwable r7 = r7.getCause()
            h7.f r7 = (p124h7.C2611f) r7
            throw r7
        L45:
            h7.f r8 = new h7.f
            r8.<init>(r7)
            throw r8
        L4b:
            r7 = move-exception
            throw r7
    }

    @Override // p124h7.AbstractC2861sf
    /* renamed from: a */
    final int mo7139a() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // p124h7.AbstractC2861sf
    /* renamed from: b */
    final void mo7140b(int r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    /* renamed from: e */
    public final void m7334e(p124h7.AbstractC2682ig r3) {
            r2 = this;
            h7.f0 r0 = p124h7.C2612f0.f11504c
            java.lang.Class r1 = r2.getClass()
            h7.i0 r0 = r0.m6688a(r1)
            h7.jg r1 = r3.f11660b
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            h7.jg r1 = new h7.jg
            r1.<init>(r3)
        L14:
            r0.mo6443f(r2, r1)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            h7.f0 r0 = p124h7.C2612f0.f11504c
            java.lang.Class r1 = r3.getClass()
            h7.i0 r0 = r0.m6688a(r1)
            h7.yg r4 = (p124h7.AbstractC2970yg) r4
            boolean r4 = r0.mo6445h(r3, r4)
            return r4
    }

    /* renamed from: f */
    public final boolean m7335f() {
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.mo6484h(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto Lf
            goto L12
        Lf:
            if (r2 != 0) goto L13
            r0 = 0
        L12:
            return r0
        L13:
            h7.f0 r2 = p124h7.C2612f0.f11504c
            java.lang.Class r3 = r4.getClass()
            h7.i0 r2 = r2.m6688a(r3)
            boolean r2 = r2.mo6447j(r4)
            if (r0 == r2) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r4
        L26:
            r3 = 2
            r4.mo6484h(r3, r0, r1)
            return r2
    }

    /* renamed from: h */
    public abstract java.lang.Object mo6484h(int r1, java.lang.Object r2, java.lang.Object r3);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            if (r0 == 0) goto L5
            return r0
        L5:
            h7.f0 r0 = p124h7.C2612f0.f11504c
            java.lang.Class r1 = r2.getClass()
            h7.i0 r0 = r0.m6688a(r1)
            int r0 = r0.mo6439b(r2)
            r2.zza = r0
            return r0
    }

    /* renamed from: i */
    public final <MessageType extends p124h7.AbstractC2970yg<MessageType, BuilderType>, BuilderType extends p124h7.C2916vg<MessageType, BuilderType>> BuilderType m7336i() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo6484h(r0, r1, r1)
            h7.vg r0 = (p124h7.C2916vg) r0
            return r0
    }

    @Override // p124h7.InterfaceC2935x
    /* renamed from: k */
    public final int mo7243k() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -1
            if (r0 != r1) goto L15
            h7.f0 r0 = p124h7.C2612f0.f11504c
            java.lang.Class r1 = r2.getClass()
            h7.i0 r0 = r0.m6688a(r1)
            int r0 = r0.mo6442e(r2)
            r2.zzd = r0
        L15:
            return r0
    }

    @Override // p124h7.InterfaceC2935x
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ p124h7.AbstractC2843rf mo7244o() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo6484h(r0, r1, r1)
            h7.vg r0 = (p124h7.C2916vg) r0
            return r0
    }

    @Override // p124h7.InterfaceC2935x
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ p124h7.AbstractC2843rf mo7245q() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo6484h(r0, r1, r1)
            h7.vg r0 = (p124h7.C2916vg) r0
            r0.m7219a(r2)
            return r0
    }

    @Override // p124h7.InterfaceC2953y
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2935x mo7223t() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.mo6484h(r0, r1, r1)
            h7.yg r0 = (p124h7.AbstractC2970yg) r0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "# "
            r1.append(r2)
            r1.append(r0)
            r0 = 0
            p124h7.C2971z.m7339c(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
