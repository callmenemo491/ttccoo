package p090f6;

/* renamed from: f6.b */
/* loaded from: classes.dex */
public final class C2067b {

    /* renamed from: a */
    public final android.content.Context f9466a;

    /* renamed from: b */
    public final p071e6.C1523b f9467b;

    /* renamed from: c */
    public android.net.Uri f9468c;

    /* renamed from: d */
    public p090f6.AsyncTaskC2069d f9469d;

    /* renamed from: e */
    public boolean f9470e;

    /* renamed from: f */
    public p090f6.InterfaceC2066a f9471f;

    public C2067b(android.content.Context r4) {
            r3 = this;
            e6.b r0 = new e6.b
            r1 = -1
            r2 = 0
            r0.<init>(r1, r2, r2)
            r3.<init>()
            r3.f9466a = r4
            r3.f9467b = r0
            r3.m5491c()
            return
    }

    public C2067b(android.content.Context r1, p071e6.C1523b r2) {
            r0 = this;
            r0.<init>()
            r0.f9466a = r1
            r0.f9467b = r2
            r0.m5491c()
            return
    }

    /* renamed from: a */
    public final void m5489a() {
            r1 = this;
            r1.m5491c()
            r0 = 0
            r1.f9471f = r0
            return
    }

    /* renamed from: b */
    public final boolean m5490b(android.net.Uri r15) {
            r14 = this;
            r0 = 1
            if (r15 != 0) goto L7
            r14.m5491c()
            return r0
        L7:
            android.net.Uri r1 = r14.f9468c
            boolean r1 = r15.equals(r1)
            r2 = 0
            if (r1 != 0) goto L4f
            r14.m5491c()
            r14.f9468c = r15
            e6.b r15 = r14.f9467b
            int r5 = r15.f7398Z
            if (r5 == 0) goto L2b
            int r6 = r15.f7399a0
            if (r6 != 0) goto L20
            goto L2b
        L20:
            android.content.Context r4 = r14.f9466a
            f6.d r15 = new f6.d
            r7 = 0
            r3 = r15
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            goto L37
        L2b:
            android.content.Context r9 = r14.f9466a
            f6.d r15 = new f6.d
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
        L37:
            r14.f9469d = r15
            f6.d r15 = r14.f9469d
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r15, r1)
            android.net.Uri r3 = r14.f9468c
            java.util.Objects.requireNonNull(r3, r1)
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r0[r2] = r3
            r15.executeOnExecutor(r1, r0)
            return r2
        L4f:
            boolean r15 = r14.f9470e
            if (r15 == 0) goto L54
            return r0
        L54:
            return r2
    }

    /* renamed from: c */
    public final void m5491c() {
            r3 = this;
            f6.d r0 = r3.f9469d
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            r0.cancel(r2)
            r3.f9469d = r1
        Lb:
            r3.f9468c = r1
            r0 = 0
            r3.f9470e = r0
            return
    }
}
