package p214m2;

/* renamed from: m2.o */
/* loaded from: classes.dex */
public class C4337o implements p180k2.InterfaceC3671c {

    /* renamed from: b */
    public final java.lang.Object f17782b;

    /* renamed from: c */
    public final int f17783c;

    /* renamed from: d */
    public final int f17784d;

    /* renamed from: e */
    public final java.lang.Class<?> f17785e;

    /* renamed from: f */
    public final java.lang.Class<?> f17786f;

    /* renamed from: g */
    public final p180k2.InterfaceC3671c f17787g;

    /* renamed from: h */
    public final java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> f17788h;

    /* renamed from: i */
    public final p180k2.C3673e f17789i;

    /* renamed from: j */
    public int f17790j;

    public C4337o(java.lang.Object r2, p180k2.InterfaceC3671c r3, int r4, int r5, java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> r6, java.lang.Class<?> r7, java.lang.Class<?> r8, p180k2.C3673e r9) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f17782b = r2
            java.lang.String r2 = "Signature must not be null"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f17787g = r3
            r1.f17783c = r4
            r1.f17784d = r5
            java.util.Objects.requireNonNull(r6, r0)
            r1.f17788h = r6
            java.lang.String r2 = "Resource class must not be null"
            java.util.Objects.requireNonNull(r7, r2)
            r1.f17785e = r7
            java.lang.String r2 = "Transcode class must not be null"
            java.util.Objects.requireNonNull(r8, r2)
            r1.f17786f = r8
            java.util.Objects.requireNonNull(r9, r0)
            r1.f17789i = r9
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p214m2.C4337o
            r1 = 0
            if (r0 == 0) goto L50
            m2.o r4 = (p214m2.C4337o) r4
            java.lang.Object r0 = r3.f17782b
            java.lang.Object r2 = r4.f17782b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            k2.c r0 = r3.f17787g
            k2.c r2 = r4.f17787g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            int r0 = r3.f17784d
            int r2 = r4.f17784d
            if (r0 != r2) goto L50
            int r0 = r3.f17783c
            int r2 = r4.f17783c
            if (r0 != r2) goto L50
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r3.f17788h
            java.util.Map<java.lang.Class<?>, k2.h<?>> r2 = r4.f17788h
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            java.lang.Class<?> r0 = r3.f17785e
            java.lang.Class<?> r2 = r4.f17785e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            java.lang.Class<?> r0 = r3.f17786f
            java.lang.Class<?> r2 = r4.f17786f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            k2.e r0 = r3.f17789i
            k2.e r4 = r4.f17789i
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L50
            r1 = 1
        L50:
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r2 = this;
            int r0 = r2.f17790j
            if (r0 != 0) goto L51
            java.lang.Object r0 = r2.f17782b
            int r0 = r0.hashCode()
            r2.f17790j = r0
            int r0 = r0 * 31
            k2.c r1 = r2.f17787g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f17790j = r1
            int r1 = r1 * 31
            int r0 = r2.f17783c
            int r1 = r1 + r0
            r2.f17790j = r1
            int r1 = r1 * 31
            int r0 = r2.f17784d
            int r1 = r1 + r0
            r2.f17790j = r1
            int r1 = r1 * 31
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r2.f17788h
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.f17790j = r0
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.f17785e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f17790j = r1
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.f17786f
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.f17790j = r0
            int r0 = r0 * 31
            k2.e r1 = r2.f17789i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f17790j = r1
        L51:
            int r0 = r2.f17790j
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "EngineKey{model="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r1 = r2.f17782b
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.f17783c
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.f17784d
            r0.append(r1)
            java.lang.String r1 = ", resourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.f17785e
            r0.append(r1)
            java.lang.String r1 = ", transcodeClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.f17786f
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            k2.c r1 = r2.f17787g
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r2.f17790j
            r0.append(r1)
            java.lang.String r1 = ", transformations="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, k2.h<?>> r1 = r2.f17788h
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            k2.e r1 = r2.f17789i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
