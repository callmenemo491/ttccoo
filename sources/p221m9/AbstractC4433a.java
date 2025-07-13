package p221m9;

import p221m9.AbstractC4433a;
import p221m9.AbstractC4433a.a;

/* renamed from: m9.a */
/* loaded from: classes.dex */
public abstract class AbstractC4433a<MessageType extends p221m9.AbstractC4433a<MessageType, BuilderType>, BuilderType extends p221m9.AbstractC4433a.a<MessageType, BuilderType>> implements p221m9.InterfaceC4482q0 {
    public int memoizedHashCode;

    /* renamed from: m9.a$a */
    public static abstract class a<MessageType extends p221m9.AbstractC4433a<MessageType, BuilderType>, BuilderType extends p221m9.AbstractC4433a.a<MessageType, BuilderType>> implements p221m9.InterfaceC4482q0.a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public AbstractC4433a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: e */
    public byte[] mo9889e() {
            r5 = this;
            r0 = r5
            m9.x r0 = (p221m9.AbstractC4501x) r0     // Catch: java.io.IOException -> L23
            int r1 = r0.mo10233a()     // Catch: java.io.IOException -> L23
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L23
            java.util.logging.Logger r3 = p221m9.AbstractC4463k.f18182b     // Catch: java.io.IOException -> L23
            m9.k$b r3 = new m9.k$b     // Catch: java.io.IOException -> L23
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L23
            r0.mo10235d(r3)     // Catch: java.io.IOException -> L23
            int r0 = r3.mo10155M()     // Catch: java.io.IOException -> L23
            if (r0 != 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L23
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)     // Catch: java.io.IOException -> L23
            throw r0     // Catch: java.io.IOException -> L23
        L23:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "byte array"
            java.lang.String r2 = r5.m9893k(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: g */
    public p221m9.AbstractC4454h mo9890g() {
            r5 = this;
            r0 = r5
            m9.x r0 = (p221m9.AbstractC4501x) r0     // Catch: java.io.IOException -> L2a
            int r1 = r0.mo10233a()     // Catch: java.io.IOException -> L2a
            m9.h r2 = p221m9.AbstractC4454h.f18139Z     // Catch: java.io.IOException -> L2a
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L2a
            java.util.logging.Logger r3 = p221m9.AbstractC4463k.f18182b     // Catch: java.io.IOException -> L2a
            m9.k$b r3 = new m9.k$b     // Catch: java.io.IOException -> L2a
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L2a
            r0.mo10235d(r3)     // Catch: java.io.IOException -> L2a
            int r0 = r3.mo10155M()     // Catch: java.io.IOException -> L2a
            if (r0 != 0) goto L22
            m9.h$f r0 = new m9.h$f     // Catch: java.io.IOException -> L2a
            r0.<init>(r2)     // Catch: java.io.IOException -> L2a
            return r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L2a
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)     // Catch: java.io.IOException -> L2a
            throw r0     // Catch: java.io.IOException -> L2a
        L2a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.String r2 = r5.m9893k(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: h */
    public int mo9891h() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: i */
    public int m9892i(p221m9.InterfaceC4447e1 r3) {
            r2 = this;
            int r0 = r2.mo9891h()
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = r3.mo9992g(r2)
            r2.mo9894l(r0)
        Le:
            return r0
    }

    /* renamed from: k */
    public final java.lang.String m9893k(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "Serializing "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " to a "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " threw an IOException (should never happen)."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* renamed from: l */
    public void mo9894l(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
