package p329s9;

/* renamed from: s9.b */
/* loaded from: classes.dex */
public class C5998b implements p329s9.InterfaceC5997a {

    /* renamed from: c */
    public static volatile p329s9.InterfaceC5997a f23130c;

    /* renamed from: a */
    public final p234n7.C4693a f23131a;

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.lang.Object> f23132b;

    /* renamed from: s9.b$a */
    public class a implements p329s9.InterfaceC5997a.a {
        public a(p329s9.C5998b r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C5998b(p234n7.C4693a r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f23131a = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f23132b = r2
            return
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: a */
    public p329s9.InterfaceC5997a.a mo12478a(java.lang.String r4, p329s9.InterfaceC5997a.b r5) {
            r3 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            boolean r0 = p341t9.C6198b.m12806c(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L25
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f23132b
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L25
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f23132b
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            return r1
        L29:
            n7.a r0 = r3.f23131a
            java.lang.String r2 = "fiam"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L39
            t9.d r2 = new t9.d
            r2.<init>(r0, r5)
            goto L51
        L39:
            java.lang.String r2 = "crash"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4c
            java.lang.String r2 = "clx"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4a
            goto L4c
        L4a:
            r2 = r1
            goto L51
        L4c:
            t9.f r2 = new t9.f
            r2.<init>(r0, r5)
        L51:
            if (r2 == 0) goto L5e
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.f23132b
            r5.put(r4, r2)
            s9.b$a r5 = new s9.b$a
            r5.<init>(r3, r4)
            return r5
        L5e:
            return r1
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: b */
    public java.util.Map<java.lang.String, java.lang.Object> mo12479b(boolean r3) {
            r2 = this;
            n7.a r0 = r2.f23131a
            k7.o1 r0 = r0.f18720a
            r1 = 0
            java.util.Map r3 = r0.m8854e(r1, r1, r3)
            return r3
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: c */
    public java.util.List<p329s9.InterfaceC5997a.c> mo12480c(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            n7.a r1 = r8.f23131a
            k7.o1 r1 = r1.f18720a
            java.util.List r9 = r1.m8853d(r9, r10)
            java.util.Iterator r9 = r9.iterator()
        L11:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lf3
            java.lang.Object r10 = r9.next()
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.util.Set<java.lang.String> r1 = p341t9.C6198b.f24145a
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r10, r3)
            s9.a$c r4 = new s9.a$c
            r4.<init>()
            r5 = 0
            java.lang.String r6 = "origin"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Objects.requireNonNull(r6, r3)
            r4.f23115a = r6
            java.lang.String r6 = "name"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Objects.requireNonNull(r6, r3)
            r4.f23116b = r6
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r6 = "value"
            java.lang.Object r3 = p124h7.C2939x3.m7292r(r10, r6, r3, r5)
            r4.f23117c = r3
            java.lang.String r3 = "trigger_event_name"
            java.lang.Object r3 = p124h7.C2939x3.m7292r(r10, r3, r2, r5)
            java.lang.String r3 = (java.lang.String) r3
            r4.f23118d = r3
            r6 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "trigger_timeout"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r1, r3)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r4.f23119e = r6
            java.lang.String r6 = "timed_out_event_name"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.f23120f = r6
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            java.lang.String r7 = "timed_out_event_params"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r7, r6, r5)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r4.f23121g = r6
            java.lang.String r6 = "triggered_event_name"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.f23122h = r6
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            java.lang.String r7 = "triggered_event_params"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r7, r6, r5)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r4.f23123i = r6
            java.lang.String r6 = "time_to_live"
            java.lang.Object r6 = p124h7.C2939x3.m7292r(r10, r6, r1, r3)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r4.f23124j = r6
            java.lang.String r6 = "expired_event_name"
            java.lang.Object r2 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            r4.f23125k = r2
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            java.lang.String r6 = "expired_event_params"
            java.lang.Object r2 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r4.f23126l = r2
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.String r6 = "active"
            java.lang.Object r2 = p124h7.C2939x3.m7292r(r10, r6, r2, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4.f23128n = r2
            java.lang.String r2 = "creation_timestamp"
            java.lang.Object r2 = p124h7.C2939x3.m7292r(r10, r2, r1, r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            r4.f23127m = r5
            java.lang.String r2 = "triggered_timestamp"
            java.lang.Object r10 = p124h7.C2939x3.m7292r(r10, r2, r1, r3)
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            r4.f23129o = r1
            r0.add(r4)
            goto L11
        Lf3:
            return r0
    }

    @Override // p329s9.InterfaceC5997a
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            n7.a r3 = r1.f23131a
            k7.o1 r3 = r3.f18720a
            java.util.Objects.requireNonNull(r3)
            k7.a1 r4 = new k7.a1
            r0 = 0
            r4.<init>(r3, r2, r0, r0)
            java.util.concurrent.ExecutorService r2 = r3.f16791a
            r2.execute(r4)
            return
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: d */
    public void mo12481d(p329s9.InterfaceC5997a.c r8) {
            r7 = this;
            java.util.Set<java.lang.String> r0 = p341t9.C6198b.f24145a
            r0 = 0
            if (r8 != 0) goto L7
            goto Lb3
        L7:
            java.lang.String r1 = r8.f23115a
            if (r1 == 0) goto Lb3
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L13
            goto Lb3
        L13:
            java.lang.Object r2 = r8.f23117c
            if (r2 == 0) goto L5c
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L48
            r4.<init>()     // Catch: java.lang.Throwable -> L48
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L48
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r5.writeObject(r2)     // Catch: java.lang.Throwable -> L44
            r5.flush()     // Catch: java.lang.Throwable -> L44
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L44
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L44
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> L44
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L42
            r5.close()     // Catch: java.lang.Throwable -> L52
            r2.close()     // Catch: java.lang.Throwable -> L52
            r3 = r4
            goto L5a
        L42:
            r4 = move-exception
            goto L4c
        L44:
            r2 = move-exception
            r4 = r2
            r2 = r3
            goto L4c
        L48:
            r2 = move-exception
            r4 = r2
            r2 = r3
            r5 = r2
        L4c:
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            goto L5a
        L54:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Throwable -> L52
        L59:
            throw r4     // Catch: java.lang.Throwable -> L52
        L5a:
            if (r3 == 0) goto Lb3
        L5c:
            boolean r2 = p341t9.C6198b.m12806c(r1)
            if (r2 != 0) goto L63
            goto Lb3
        L63:
            java.lang.String r2 = r8.f23116b
            boolean r2 = p341t9.C6198b.m12807d(r1, r2)
            if (r2 != 0) goto L6c
            goto Lb3
        L6c:
            java.lang.String r2 = r8.f23125k
            if (r2 == 0) goto L83
            android.os.Bundle r3 = r8.f23126l
            boolean r2 = p341t9.C6198b.m12805b(r2, r3)
            if (r2 != 0) goto L79
            goto Lb3
        L79:
            java.lang.String r2 = r8.f23125k
            android.os.Bundle r3 = r8.f23126l
            boolean r2 = p341t9.C6198b.m12804a(r1, r2, r3)
            if (r2 == 0) goto Lb3
        L83:
            java.lang.String r2 = r8.f23122h
            if (r2 == 0) goto L9a
            android.os.Bundle r3 = r8.f23123i
            boolean r2 = p341t9.C6198b.m12805b(r2, r3)
            if (r2 != 0) goto L90
            goto Lb3
        L90:
            java.lang.String r2 = r8.f23122h
            android.os.Bundle r3 = r8.f23123i
            boolean r2 = p341t9.C6198b.m12804a(r1, r2, r3)
            if (r2 == 0) goto Lb3
        L9a:
            java.lang.String r2 = r8.f23120f
            if (r2 == 0) goto Lb2
            android.os.Bundle r3 = r8.f23121g
            boolean r2 = p341t9.C6198b.m12805b(r2, r3)
            if (r2 != 0) goto La7
            goto Lb3
        La7:
            java.lang.String r2 = r8.f23120f
            android.os.Bundle r3 = r8.f23121g
            boolean r1 = p341t9.C6198b.m12804a(r1, r2, r3)
            if (r1 != 0) goto Lb2
            goto Lb3
        Lb2:
            r0 = 1
        Lb3:
            if (r0 != 0) goto Lb6
            return
        Lb6:
            n7.a r0 = r7.f23131a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r8.f23115a
            if (r2 == 0) goto Lc6
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        Lc6:
            java.lang.String r2 = r8.f23116b
            if (r2 == 0) goto Lcf
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        Lcf:
            java.lang.Object r2 = r8.f23117c
            if (r2 == 0) goto Ld6
            p124h7.C2939x3.m7298x(r1, r2)
        Ld6:
            java.lang.String r2 = r8.f23118d
            if (r2 == 0) goto Ldf
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        Ldf:
            long r2 = r8.f23119e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r8.f23120f
            if (r2 == 0) goto Lef
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        Lef:
            android.os.Bundle r2 = r8.f23121g
            if (r2 == 0) goto Lf8
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        Lf8:
            java.lang.String r2 = r8.f23122h
            if (r2 == 0) goto L101
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L101:
            android.os.Bundle r2 = r8.f23123i
            if (r2 == 0) goto L10a
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L10a:
            long r2 = r8.f23124j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r8.f23125k
            if (r2 == 0) goto L11a
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L11a:
            android.os.Bundle r2 = r8.f23126l
            if (r2 == 0) goto L123
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L123:
            long r2 = r8.f23127m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r8.f23128n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r8.f23129o
            java.lang.String r8 = "triggered_timestamp"
            r1.putLong(r8, r2)
            k7.o1 r8 = r0.f18720a
            java.util.Objects.requireNonNull(r8)
            k7.z0 r0 = new k7.z0
            r0.<init>(r8, r1)
            java.util.concurrent.ExecutorService r8 = r8.f16791a
            r8.execute(r0)
            return
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: e */
    public void mo12482e(java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
            r8 = this;
            boolean r0 = p341t9.C6198b.m12806c(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = p341t9.C6198b.m12807d(r9, r10)
            if (r0 != 0) goto Le
            return
        Le:
            n7.a r0 = r8.f23131a
            k7.o1 r0 = r0.f18720a
            java.util.Objects.requireNonNull(r0)
            k7.f1 r7 = new k7.f1
            r6 = 1
            r1 = r7
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r9 = r0.f16791a
            r9.execute(r7)
            return
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: f */
    public void mo12483f(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            if (r6 != 0) goto L7
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L7:
            boolean r0 = p341t9.C6198b.m12806c(r4)
            if (r0 != 0) goto Le
            return
        Le:
            boolean r0 = p341t9.C6198b.m12805b(r5, r6)
            if (r0 != 0) goto L15
            return
        L15:
            boolean r0 = p341t9.C6198b.m12804a(r4, r5, r6)
            if (r0 != 0) goto L1c
            return
        L1c:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L33
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L33
            r0 = 1
            java.lang.String r2 = "_r"
            r6.putLong(r2, r0)
        L33:
            n7.a r0 = r3.f23131a
            k7.o1 r0 = r0.f18720a
            r0.m8855f(r4, r5, r6)
            return
    }

    @Override // p329s9.InterfaceC5997a
    /* renamed from: g */
    public int mo12484g(java.lang.String r2) {
            r1 = this;
            n7.a r0 = r1.f23131a
            k7.o1 r0 = r0.f18720a
            int r2 = r0.m8852b(r2)
            return r2
    }
}
