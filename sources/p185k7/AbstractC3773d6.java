package p185k7;

import p185k7.AbstractC3773d6;
import p185k7.C3731a6;

/* renamed from: k7.d6 */
/* loaded from: classes.dex */
public abstract class AbstractC3773d6<MessageType extends p185k7.AbstractC3773d6<MessageType, BuilderType>, BuilderType extends p185k7.C3731a6<MessageType, BuilderType>> extends p185k7.AbstractC4064z4<MessageType, BuilderType> {
    private static final java.util.Map<java.lang.Object, p185k7.AbstractC3773d6<?, ?>> zza = null;
    public p185k7.C3775d8 zzc;
    public int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p185k7.AbstractC3773d6.zza = r0
            return
    }

    public AbstractC3773d6() {
            r1 = this;
            r1.<init>()
            k7.d8 r0 = p185k7.C3775d8.f16560f
            r1.zzc = r0
            r0 = -1
            r1.zzd = r0
            return
    }

    /* renamed from: j */
    public static <E> p185k7.InterfaceC3857j6<E> m8489j(p185k7.InterfaceC3857j6<E> r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            k7.j6 r1 = r1.mo8299k(r0)
            return r1
    }

    /* renamed from: k */
    public static java.lang.Object m8490k(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
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

    /* renamed from: l */
    public static <T extends p185k7.AbstractC3773d6> void m8491l(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, k7.d6<?, ?>> r0 = p185k7.AbstractC3773d6.zza
            r0.put(r1, r2)
            return
    }

    /* renamed from: p */
    public static <T extends p185k7.AbstractC3773d6> T m8492p(java.lang.Class<T> r4) {
            java.util.Map<java.lang.Object, k7.d6<?, ?>> r0 = p185k7.AbstractC3773d6.zza
            java.lang.Object r1 = r0.get(r4)
            k7.d6 r1 = (p185k7.AbstractC3773d6) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            r2 = 1
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            k7.d6 r1 = (p185k7.AbstractC3773d6) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = p185k7.C3859j8.m8735i(r4)
            k7.d6 r1 = (p185k7.AbstractC3773d6) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.mo8189r(r2, r3, r3)
            k7.d6 r1 = (p185k7.AbstractC3773d6) r1
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

    /* renamed from: q */
    public static p185k7.InterfaceC3843i6 m8493q(p185k7.InterfaceC3843i6 r1) {
            k7.u6 r1 = (p185k7.C4001u6) r1
            int r0 = r1.f16894a0
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            k7.i6 r1 = r1.m9058h(r0)
            return r1
    }

    @Override // p185k7.InterfaceC3802f7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ p185k7.AbstractC4051y4 mo8494a() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo8189r(r0, r1, r1)
            k7.a6 r0 = (p185k7.C3731a6) r0
            r0.m8205m(r2)
            return r0
    }

    @Override // p185k7.InterfaceC3802f7
    /* renamed from: c */
    public final int mo8495c() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -1
            if (r0 != r1) goto L15
            k7.n7 r0 = p185k7.C3911n7.f16770c
            java.lang.Class r1 = r2.getClass()
            k7.q7 r0 = r0.m8848a(r1)
            int r0 = r0.mo8686e(r2)
            r2.zzd = r0
        L15:
            return r0
    }

    @Override // p185k7.InterfaceC3816g7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3802f7 mo8200d() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.mo8189r(r0, r1, r1)
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0
            return r0
    }

    @Override // p185k7.InterfaceC3802f7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p185k7.AbstractC4051y4 mo8496e() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo8189r(r0, r1, r1)
            k7.a6 r0 = (p185k7.C3731a6) r0
            return r0
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
            k7.n7 r0 = p185k7.C3911n7.f16770c
            java.lang.Class r1 = r3.getClass()
            k7.q7 r0 = r0.m8848a(r1)
            k7.d6 r4 = (p185k7.AbstractC3773d6) r4
            boolean r4 = r0.mo8689h(r3, r4)
            return r4
    }

    @Override // p185k7.AbstractC4064z4
    /* renamed from: f */
    public final int mo8497f() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // p185k7.AbstractC4064z4
    /* renamed from: h */
    public final void mo8498h(int r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            k7.n7 r0 = p185k7.C3911n7.f16770c
            java.lang.Class r1 = r2.getClass()
            k7.q7 r0 = r0.m8848a(r1)
            int r0 = r0.mo8683b(r2)
            r2.zzb = r0
            return r0
    }

    /* renamed from: m */
    public final void m8499m(p185k7.AbstractC3896m5 r3) {
            r2 = this;
            k7.n7 r0 = p185k7.C3911n7.f16770c
            java.lang.Class r1 = r2.getClass()
            k7.q7 r0 = r0.m8848a(r1)
            k7.n5 r1 = r3.f16747Z
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            k7.n5 r1 = new k7.n5
            r1.<init>(r3)
        L14:
            r0.mo8688g(r2, r1)
            return
    }

    /* renamed from: n */
    public final <MessageType extends p185k7.AbstractC3773d6<MessageType, BuilderType>, BuilderType extends p185k7.C3731a6<MessageType, BuilderType>> BuilderType m8500n() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo8189r(r0, r1, r1)
            k7.a6 r0 = (p185k7.C3731a6) r0
            return r0
    }

    /* renamed from: o */
    public final BuilderType m8501o() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo8189r(r0, r1, r1)
            k7.a6 r0 = (p185k7.C3731a6) r0
            r0.m8205m(r2)
            return r0
    }

    /* renamed from: r */
    public abstract java.lang.Object mo8189r(int r1, java.lang.Object r2, java.lang.Object r3);

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "# "
            r1.append(r2)
            r1.append(r0)
            r0 = 0
            p185k7.C3830h7.m8614c(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
