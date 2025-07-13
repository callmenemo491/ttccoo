package p221m9;

/* renamed from: m9.i0 */
/* loaded from: classes.dex */
public final class C4458i0 implements p221m9.InterfaceC4450f1 {

    /* renamed from: b */
    public static final p221m9.InterfaceC4479p0 f18158b = null;

    /* renamed from: a */
    public final p221m9.InterfaceC4479p0 f18159a;

    /* renamed from: m9.i0$a */
    public class a implements p221m9.InterfaceC4479p0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p221m9.InterfaceC4479p0
        /* renamed from: a */
        public p221m9.InterfaceC4476o0 mo10107a(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "This should never be called."
                r2.<init>(r0)
                throw r2
        }

        @Override // p221m9.InterfaceC4479p0
        /* renamed from: b */
        public boolean mo10108b(java.lang.Class<?> r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: m9.i0$b */
    public static class b implements p221m9.InterfaceC4479p0 {

        /* renamed from: a */
        public p221m9.InterfaceC4479p0[] f18160a;

        public b(p221m9.InterfaceC4479p0... r1) {
                r0 = this;
                r0.<init>()
                r0.f18160a = r1
                return
        }

        @Override // p221m9.InterfaceC4479p0
        /* renamed from: a */
        public p221m9.InterfaceC4476o0 mo10107a(java.lang.Class<?> r6) {
                r5 = this;
                m9.p0[] r0 = r5.f18160a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                boolean r4 = r3.mo10108b(r6)
                if (r4 == 0) goto L13
                m9.o0 r6 = r3.mo10107a(r6)
                return r6
            L13:
                int r2 = r2 + 1
                goto L4
            L16:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "No factory is available for message type: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // p221m9.InterfaceC4479p0
        /* renamed from: b */
        public boolean mo10108b(java.lang.Class<?> r6) {
                r5 = this;
                m9.p0[] r0 = r5.f18160a
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r4 = r4.mo10108b(r6)
                if (r4 == 0) goto L11
                r6 = 1
                return r6
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }
    }

    static {
            m9.i0$a r0 = new m9.i0$a
            r0.<init>()
            p221m9.C4458i0.f18158b = r0
            return
    }

    public C4458i0() {
            r6 = this;
            m9.i0$b r0 = new m9.i0$b
            r1 = 2
            m9.p0[] r1 = new p221m9.InterfaceC4479p0[r1]
            m9.w r2 = p221m9.C4499w.f18291a
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L22
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L22
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L22
            m9.p0 r2 = (p221m9.InterfaceC4479p0) r2     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            m9.p0 r2 = p221m9.C4458i0.f18158b
        L24:
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r6.<init>()
            java.nio.charset.Charset r1 = p221m9.C4505z.f18308a
            r6.f18159a = r0
            return
    }
}
