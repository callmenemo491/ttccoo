package p072e7;

import p072e7.AbstractC1783x5;
import p072e7.C1765v5;

/* renamed from: e7.x5 */
/* loaded from: classes.dex */
public abstract class AbstractC1783x5<MessageType extends p072e7.AbstractC1783x5<MessageType, BuilderType>, BuilderType extends p072e7.C1765v5<MessageType, BuilderType>> extends p072e7.AbstractC1558a5<MessageType, BuilderType> {
    private static final java.util.Map<java.lang.Object, p072e7.AbstractC1783x5<?, ?>> zzb = null;
    public p072e7.C1561a8 zzc;
    public int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p072e7.AbstractC1783x5.zzb = r0
            return
    }

    public AbstractC1783x5() {
            r1 = this;
            r1.<init>()
            e7.a8 r0 = p072e7.C1561a8.f7482d
            r1.zzc = r0
            r0 = -1
            r1.zzd = r0
            return
    }

    /* renamed from: c */
    public static <T extends p072e7.AbstractC1783x5> void m4486c(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, e7.x5<?, ?>> r0 = p072e7.AbstractC1783x5.zzb
            r0.put(r1, r2)
            return
    }

    /* renamed from: g */
    public static <T extends p072e7.AbstractC1783x5> T m4487g(java.lang.Class<T> r4) {
            java.util.Map<java.lang.Object, e7.x5<?, ?>> r0 = p072e7.AbstractC1783x5.zzb
            java.lang.Object r1 = r0.get(r4)
            e7.x5 r1 = (p072e7.AbstractC1783x5) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            r2 = 1
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            e7.x5 r1 = (p072e7.AbstractC1783x5) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = p072e7.C1651j8.m4303i(r4)
            e7.x5 r1 = (p072e7.AbstractC1783x5) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.mo4118e(r2, r3, r3)
            e7.x5 r1 = (p072e7.AbstractC1783x5) r1
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

    /* renamed from: h */
    public static java.lang.Object m4488h(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
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

    @Override // p072e7.AbstractC1558a5
    /* renamed from: a */
    final int mo4120a() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // p072e7.AbstractC1558a5
    /* renamed from: b */
    final void mo4121b(int r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    /* renamed from: d */
    public final void m4489d(p072e7.AbstractC1668l5 r3) {
            r2 = this;
            e7.i7 r0 = p072e7.C1640i7.f7650c
            java.lang.Class r1 = r2.getClass()
            e7.l7 r0 = r0.m4233a(r1)
            e7.m5 r1 = r3.f7687Z
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            e7.m5 r1 = new e7.m5
            r1.<init>(r3)
        L14:
            r0.mo4170g(r2, r1)
            return
    }

    /* renamed from: e */
    public abstract java.lang.Object mo4118e(int r1, java.lang.Object r2, java.lang.Object r3);

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
            e7.i7 r0 = p072e7.C1640i7.f7650c
            java.lang.Class r1 = r3.getClass()
            e7.l7 r0 = r0.m4233a(r1)
            e7.x5 r4 = (p072e7.AbstractC1783x5) r4
            boolean r4 = r0.mo4171h(r3, r4)
            return r4
    }

    /* renamed from: f */
    public final <MessageType extends p072e7.AbstractC1783x5<MessageType, BuilderType>, BuilderType extends p072e7.C1765v5<MessageType, BuilderType>> BuilderType m4490f() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo4118e(r0, r1, r1)
            e7.v5 r0 = (p072e7.C1765v5) r0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            if (r0 == 0) goto L5
            return r0
        L5:
            e7.i7 r0 = p072e7.C1640i7.f7650c
            java.lang.Class r1 = r2.getClass()
            e7.l7 r0 = r0.m4233a(r1)
            int r0 = r0.mo4165b(r2)
            r2.zza = r0
            return r0
    }

    @Override // p072e7.InterfaceC1560a7
    /* renamed from: j */
    public final int mo4123j() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -1
            if (r0 != r1) goto L15
            e7.i7 r0 = p072e7.C1640i7.f7650c
            java.lang.Class r1 = r2.getClass()
            e7.l7 r0 = r0.m4233a(r1)
            int r0 = r0.mo4168e(r2)
            r2.zzd = r0
        L15:
            return r0
    }

    @Override // p072e7.InterfaceC1570b7
    /* renamed from: k */
    public final /* synthetic */ p072e7.InterfaceC1560a7 mo4130k() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.mo4118e(r0, r1, r1)
            e7.x5 r0 = (p072e7.AbstractC1783x5) r0
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
            p072e7.C1580c7.m4146c(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // p072e7.InterfaceC1560a7
    /* renamed from: u */
    public final /* synthetic */ p072e7.AbstractC1800z4 mo4124u() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.mo4118e(r0, r1, r1)
            e7.v5 r0 = (p072e7.C1765v5) r0
            r0.m4458b(r2)
            return r0
    }
}
