package p112g9;

/* renamed from: g9.i */
/* loaded from: classes.dex */
public final class C2307i implements p093f9.InterfaceC2083a {

    /* renamed from: c */
    public static final byte[] f10525c = null;

    /* renamed from: a */
    public final p204l9.C4231y f10526a;

    /* renamed from: b */
    public final p093f9.InterfaceC2083a f10527b;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            p112g9.C2307i.f10525c = r0
            return
    }

    public C2307i(p204l9.C4231y r1, p093f9.InterfaceC2083a r2) {
            r0 = this;
            r0.<init>()
            r0.f10526a = r1
            r0.f10527b = r2
            return
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r7, byte[] r8) {
            r6 = this;
            l9.y r0 = r6.f10526a
            java.util.logging.Logger r1 = p093f9.C2100r.f9524a
            java.lang.Class<f9.r> r1 = p093f9.C2100r.class
            monitor-enter(r1)
            java.lang.String r2 = r0.m9539C()     // Catch: java.lang.Throwable -> L8e
            f9.r$a r2 = p093f9.C2100r.m5548b(r2)     // Catch: java.lang.Throwable -> L8e
            f9.d r2 = r2.mo5544b()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = p093f9.C2100r.f9527d     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = r0.m9539C()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L8e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L73
            m9.h r0 = r0.m9540D()     // Catch: java.lang.Throwable -> L8e
            f9.e r2 = (p093f9.C2087e) r2     // Catch: java.lang.Throwable -> L8e
            m9.q0 r0 = r2.m5511b(r0)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r1)
            byte[] r0 = r0.mo9889e()
            f9.a r1 = r6.f10527b
            byte[] r2 = p112g9.C2307i.f10525c
            byte[] r1 = r1.mo5506a(r0, r2)
            l9.y r2 = r6.f10526a
            java.lang.String r2 = r2.m9539C()
            java.lang.Class<f9.a> r3 = p093f9.InterfaceC2083a.class
            m9.h r4 = p221m9.AbstractC4454h.f18139Z
            int r4 = r0.length
            r5 = 0
            m9.h r0 = p221m9.AbstractC4454h.m10054i(r0, r5, r4)
            java.lang.Object r0 = p093f9.C2100r.m5550d(r2, r0, r3)
            f9.a r0 = (p093f9.InterfaceC2083a) r0
            byte[] r7 = r0.mo5506a(r7, r8)
            int r8 = r1.length
            int r8 = r8 + 4
            int r0 = r7.length
            int r8 = r8 + r0
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            int r0 = r1.length
            java.nio.ByteBuffer r8 = r8.putInt(r0)
            java.nio.ByteBuffer r8 = r8.put(r1)
            java.nio.ByteBuffer r7 = r8.put(r7)
            byte[] r7 = r7.array()
            return r7
        L73:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r8.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "newKey-operation not permitted for key type "
            r8.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r0.m9539C()     // Catch: java.lang.Throwable -> L8e
            r8.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r6, byte[] r7) {
            r5 = this;
            java.lang.String r0 = "invalid ciphertext"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.getInt()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            if (r2 <= 0) goto L3f
            int r6 = r6.length     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r6 = r6 + (-4)
            if (r2 > r6) goto L3f
            byte[] r6 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r3 = 0
            r1.get(r6, r3, r2)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r2 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r4 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r1.get(r2, r3, r4)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            f9.a r1 = r5.f10527b     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r3 = p112g9.C2307i.f10525c     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r1.mo5507b(r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            l9.y r1 = r5.f10526a     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.String r1 = r1.m9539C()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.Class<f9.a> r3 = p093f9.InterfaceC2083a.class
            java.lang.Object r6 = p093f9.C2100r.m5549c(r1, r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            f9.a r6 = (p093f9.InterfaceC2083a) r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r6.mo5507b(r2, r7)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            return r6
        L3f:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r6.<init>(r0)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            throw r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
        L45:
            r6 = move-exception
            goto L4a
        L47:
            r6 = move-exception
            goto L4a
        L49:
            r6 = move-exception
        L4a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r0, r6)
            throw r7
    }
}
