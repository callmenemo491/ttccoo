package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public class C0311x implements p243o1.InterfaceC4875e, p180k2.InterfaceC3675g, bh.InterfaceC0769a, p090f6.InterfaceC2066a, p218m6.InterfaceC4396i, p327s7.InterfaceC5977a, p185k7.InterfaceC3729a4, p249o7.InterfaceC5017i3 {

    /* renamed from: b0 */
    public static androidx.appcompat.widget.C0311x f1479b0;

    /* renamed from: Y */
    public final /* synthetic */ int f1480Y;

    /* renamed from: Z */
    public java.lang.Object f1481Z;

    /* renamed from: a0 */
    public java.lang.Object f1482a0;

    public C0311x(int r4) {
            r3 = this;
            r3.f1480Y = r4
            r0 = 5
            if (r4 == r0) goto Lbd
            r0 = 17
            if (r4 == r0) goto Lab
            r0 = 7
            if (r4 == r0) goto La7
            r0 = 8
            if (r4 == r0) goto L8f
            r0 = 14
            if (r4 == r0) goto L77
            r0 = 15
            if (r4 == r0) goto L2a
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f1481Z = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f1482a0 = r4
            return
        L2a:
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f1481Z = r4
            k7.a0 r4 = new k7.a0
            r4.<init>()
            r3.f1482a0 = r4
            k7.t r4 = new k7.t
            r0 = 0
            r4.<init>(r0)
            r3.m829u(r4)
            k7.v r4 = new k7.v
            r4.<init>(r0)
            r3.m829u(r4)
            k7.w r4 = new k7.w
            r4.<init>(r0)
            r3.m829u(r4)
            k7.t r4 = new k7.t
            r0 = 1
            r4.<init>(r0)
            r3.m829u(r4)
            k7.v r4 = new k7.v
            r4.<init>(r0)
            r3.m829u(r4)
            k7.w r4 = new k7.w
            r4.<init>(r0)
            r3.m829u(r4)
            k7.t r4 = new k7.t
            r0 = 2
            r4.<init>(r0)
            r3.m829u(r4)
            return
        L77:
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r0 = 16
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 10
            r4.<init>(r0, r1, r2)
            r3.f1481Z = r4
            java.lang.ref.ReferenceQueue r4 = new java.lang.ref.ReferenceQueue
            r4.<init>()
            r3.f1482a0 = r4
            return
        L8f:
            r3.<init>()
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r0 = 512(0x200, float:7.17E-43)
            r4.<init>(r0)
            r3.f1481Z = r4
            java.io.DataOutputStream r4 = new java.io.DataOutputStream
            java.lang.Object r0 = r3.f1481Z
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            r4.<init>(r0)
            r3.f1482a0 = r4
            return
        La7:
            r3.<init>()
            return
        Lab:
            r3.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r3.f1481Z = r4
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r3.f1482a0 = r4
            return
        Lbd:
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r3.f1481Z = r4
            s.a r4 = new s.a
            r4.<init>()
            r3.f1482a0 = r4
            return
    }

    public C0311x(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            r0 = 26
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 22
            r1.f1480Y = r0
            r1.<init>()
            r1.f1482a0 = r3
            android.content.Context r2 = r2.getApplicationContext()
            if (r4 != 0) goto L14
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            goto L19
        L14:
            r3 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)
        L19:
            r1.f1481Z = r2
            return
    }

    public C0311x(android.content.Context r6, java.lang.String r7, boolean r8) {
            r5 = this;
            r8 = 23
            r5.f1480Y = r8
            r5.<init>()
            r5.f1481Z = r7
            p124h7.C2597e3.m6642a()     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            h7.k3 r8 = new h7.k3     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r8.<init>()     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r2 = 0
            r1[r2] = r7     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            java.lang.String r3 = "GenericIdpKeyset"
            java.lang.String r4 = "com.google.firebase.auth.api.crypto.%s"
            java.lang.String r1 = java.lang.String.format(r4, r1)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r8.m6939d(r6, r3, r1)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            h7.m6 r6 = p124h7.C2669i3.f11609a     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r8.m6938c(r6)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            r6[r2] = r7     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            java.lang.String r7 = "android-keystore://firebear_master_key_id.%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            java.lang.String r7 = "android-keystore://"
            boolean r7 = r6.startsWith(r7)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            if (r7 == 0) goto L40
            r8.f11693Z = r6     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            h7.l3 r6 = r8.m6940f()     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            goto L6b
        L40:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            java.lang.String r7 = "key URI must start with android-keystore://"
            r6.<init>(r7)     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
            throw r6     // Catch: java.io.IOException -> L48 java.security.GeneralSecurityException -> L4a
        L48:
            r6 = move-exception
            goto L4b
        L4a:
            r6 = move-exception
        L4b:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Exception encountered during crypto setup:\n"
            int r8 = r6.length()
            if (r8 == 0) goto L60
            java.lang.String r6 = r7.concat(r6)
            goto L65
        L60:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L65:
            java.lang.String r7 = "FirebearCryptoHelper"
            android.util.Log.e(r7, r6)
            r6 = 0
        L6b:
            r5.f1482a0 = r6
            return
    }

    public C0311x(android.os.IBinder r4) {
            r3 = this;
            r0 = 12
            r3.f1480Y = r0
            r3.<init>()
            java.lang.String r0 = r4.getInterfaceDescriptor()
            java.lang.String r1 = "android.os.IMessenger"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L1e
            android.os.Messenger r0 = new android.os.Messenger
            r0.<init>(r4)
            r3.f1481Z = r0
            r3.f1482a0 = r2
            goto L2f
        L1e:
            java.lang.String r1 = "com.google.android.gms.iid.IMessengerCompat"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L30
            j6.d r0 = new j6.d
            r0.<init>(r4)
            r3.f1482a0 = r0
            r3.f1481Z = r2
        L2f:
            return
        L30:
            java.lang.String r4 = "Invalid interface descriptor: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L41
            java.lang.String r4 = r4.concat(r0)
            goto L47
        L41:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            r4 = r0
        L47:
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.w(r0, r4)
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>()
            throw r4
    }

    public C0311x(android.widget.TextView r2) {
            r1 = this;
            r0 = 0
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            return
    }

    public C0311x(bh.InterfaceC0769a r2, bh.InterfaceC0769a r3) {
            r1 = this;
            r0 = 6
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public /* synthetic */ C0311x(com.google.android.gms.cast.C1060d r2, java.lang.String r3) {
            r1 = this;
            r0 = 11
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(com.google.android.gms.cast.framework.media.MediaNotificationService r2, androidx.appcompat.widget.C0311x r3) {
            r1 = this;
            r0 = 9
            r1.f1480Y = r0
            r1.f1482a0 = r2
            r1.f1481Z = r3
            r1.<init>()
            return
    }

    public C0311x(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, p185k7.InterfaceC3995u0 r3) {
            r1 = this;
            r0 = 21
            r1.f1480Y = r0
            r1.f1482a0 = r2
            r1.<init>()
            r1.f1481Z = r3
            return
    }

    public C0311x(com.google.firebase.messaging.FirebaseMessaging r2, java.lang.String r3) {
            r1 = this;
            r0 = 27
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(com.google.firebase.messaging.FirebaseMessaging r2, p327s7.AbstractC5985i r3) {
            r1 = this;
            r0 = 28
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(p057db.C1425z r2, java.lang.String r3) {
            r1 = this;
            r0 = 29
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(p164j6.C3429c r2, android.os.Bundle r3) {
            r1 = this;
            r0 = 13
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(java.lang.String r2) {
            r1 = this;
            r0 = 2
            r1.f1480Y = r0
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0311x(java.lang.String r2, p185k7.C3827h4 r3) {
            r1 = this;
            r0 = 24
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            r2 = 2
            r0.f1480Y = r2
            r0.<init>()
            r0.f1481Z = r1
            r1 = 0
            r0.f1482a0 = r1
            return
    }

    public C0311x(java.nio.channels.FileChannel r2, java.nio.channels.FileLock r3) {
            r1 = this;
            r0 = 25
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(p179k1.AbstractC3664v r2) {
            r1 = this;
            r0 = 1
            r1.f1480Y = r0
            r1.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.f1481Z = r0
            r1.f1482a0 = r2
            return
    }

    public /* synthetic */ C0311x(p185k7.C3771d4 r2, java.lang.String r3) {
            r1 = this;
            r0 = 16
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(p229n2.InterfaceC4673c r2, p180k2.InterfaceC3675g r3) {
            r1 = this;
            r0 = 4
            r1.f1480Y = r0
            r1.<init>()
            r1.f1481Z = r2
            r1.f1482a0 = r3
            return
    }

    public C0311x(p233n6.C4691a r2) {
            r1 = this;
            r0 = 10
            r1.f1480Y = r0
            r1.<init>()
            if (r2 != 0) goto Lb
            r2 = 0
            goto Ld
        Lb:
            android.net.Uri r2 = r2.f18717Z
        Ld:
            r1.f1481Z = r2
            return
    }

    public C0311x(p249o7.C4953a4 r2, java.lang.String r3) {
            r1 = this;
            r0 = 18
            r1.f1480Y = r0
            r1.f1482a0 = r2
            r1.f1481Z = r3
            r1.<init>()
            return
    }

    public C0311x(p249o7.C4996f6 r2) {
            r1 = this;
            r0 = 19
            r1.f1480Y = r0
            r1.f1482a0 = r2
            r1.<init>()
            return
    }

    public C0311x(p249o7.C5052m6 r2, java.lang.String r3) {
            r1 = this;
            r0 = 20
            r1.f1480Y = r0
            r1.f1482a0 = r2
            r1.f1481Z = r3
            r1.<init>()
            return
    }

    /* renamed from: f */
    public static androidx.appcompat.widget.C0311x m808f(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L35
        L21:
            r1 = move-exception
            goto L35
        L23:
            r1 = move-exception
            goto L35
        L25:
            r5 = move-exception
            goto L2a
        L27:
            r5 = move-exception
            goto L2a
        L29:
            r5 = move-exception
        L2a:
            r1 = r5
            r5 = r0
            goto L35
        L2d:
            r4 = move-exception
            goto L32
        L2f:
            r4 = move-exception
            goto L32
        L31:
            r4 = move-exception
        L32:
            r1 = r4
            r4 = r0
            r5 = r4
        L35:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L43
            r5.release()     // Catch: java.io.IOException -> L42
            goto L43
        L42:
        L43:
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.io.IOException -> L48
        L48:
            return r0
    }

    /* renamed from: q */
    public static androidx.appcompat.widget.C0311x m809q(android.content.Context r2, java.lang.String r3) {
            androidx.appcompat.widget.x r0 = androidx.appcompat.widget.C0311x.f1479b0
            if (r0 == 0) goto L12
            java.lang.Object r0 = r0.f1481Z
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == r3) goto L1a
            if (r0 == 0) goto L12
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L1a
        L12:
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r1 = 1
            r0.<init>(r2, r3, r1)
            androidx.appcompat.widget.C0311x.f1479b0 = r0
        L1a:
            androidx.appcompat.widget.x r2 = androidx.appcompat.widget.C0311x.f1479b0
            return r2
    }

    /* renamed from: w */
    public static final int m810w(p365v.C6476c r0, p185k7.C3903n r1, p185k7.InterfaceC3916o r2) {
            java.util.List r2 = java.util.Collections.singletonList(r2)
            k7.o r0 = r1.mo8522b(r0, r2)
            boolean r1 = r0 instanceof p185k7.C3808g
            if (r1 == 0) goto L19
            java.lang.Double r0 = r0.mo8355g()
            double r0 = r0.doubleValue()
            int r0 = p124h7.C2939x3.m7296v(r0)
            return r0
        L19:
            r0 = -1
            return r0
    }

    @Override // p185k7.InterfaceC3729a4
    /* renamed from: a */
    public java.lang.Object mo811a() {
            r11 = this;
            java.lang.Object r0 = r11.f1481Z
            k7.d4 r0 = (p185k7.C3771d4) r0
            java.lang.Object r1 = r11.f1482a0
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r0 = r0.f16555a
            android.content.ContentResolver r2 = r0.getContentResolver()
            android.net.Uri r0 = p185k7.C3998u3.f16878a
            java.lang.Class<k7.u3> r0 = p185k7.C3998u3.class
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = p185k7.C3998u3.f16882e     // Catch: java.lang.Throwable -> Lb3
            r8 = 1
            r4 = 0
            if (r3 != 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r3 = p185k7.C3998u3.f16881d     // Catch: java.lang.Throwable -> Lb3
            r3.set(r4)     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            p185k7.C3998u3.f16882e = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            p185k7.C3998u3.f16887j = r3     // Catch: java.lang.Throwable -> Lb3
            android.net.Uri r3 = p185k7.C3998u3.f16878a     // Catch: java.lang.Throwable -> Lb3
            k7.t3 r5 = new k7.t3     // Catch: java.lang.Throwable -> Lb3
            r5.<init>()     // Catch: java.lang.Throwable -> Lb3
            r2.registerContentObserver(r3, r8, r5)     // Catch: java.lang.Throwable -> Lb3
            goto L5f
        L37:
            java.util.concurrent.atomic.AtomicBoolean r3 = p185k7.C3998u3.f16881d     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r3.getAndSet(r4)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L5f
            java.util.HashMap<java.lang.String, java.lang.String> r3 = p185k7.C3998u3.f16882e     // Catch: java.lang.Throwable -> Lb3
            r3.clear()     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = p185k7.C3998u3.f16883f     // Catch: java.lang.Throwable -> Lb3
            r3.clear()     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = p185k7.C3998u3.f16884g     // Catch: java.lang.Throwable -> Lb3
            r3.clear()     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.String, java.lang.Long> r3 = p185k7.C3998u3.f16885h     // Catch: java.lang.Throwable -> Lb3
            r3.clear()     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.String, java.lang.Float> r3 = p185k7.C3998u3.f16886i     // Catch: java.lang.Throwable -> Lb3
            r3.clear()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            p185k7.C3998u3.f16887j = r3     // Catch: java.lang.Throwable -> Lb3
        L5f:
            java.lang.Object r9 = p185k7.C3998u3.f16887j     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.String, java.lang.String> r3 = p185k7.C3998u3.f16882e     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> Lb3
            r10 = 0
            if (r3 == 0) goto L78
            java.util.HashMap<java.lang.String, java.lang.String> r2 = p185k7.C3998u3.f16882e     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L75
            goto L76
        L75:
            r10 = r1
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            goto Lad
        L78:
            java.lang.String[] r3 = p185k7.C3998u3.f16888k     // Catch: java.lang.Throwable -> Lb3
            int r3 = r3.length     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            android.net.Uri r3 = p185k7.C3998u3.f16878a
            java.lang.String[] r6 = new java.lang.String[r8]
            r6[r4] = r1
            r4 = 0
            r5 = 0
            r7 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L8c
            goto Lad
        L8c:
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L96
            p185k7.C3998u3.m9053a(r9, r1, r10)     // Catch: java.lang.Throwable -> Lae
            goto Laa
        L96:
            java.lang.String r2 = r0.getString(r8)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto La3
            boolean r3 = r2.equals(r10)     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto La3
            r2 = r10
        La3:
            p185k7.C3998u3.m9053a(r9, r1, r2)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto La9
            goto Laa
        La9:
            r10 = r2
        Laa:
            r0.close()
        Lad:
            return r10
        Lae:
            r1 = move-exception
            r0.close()
            throw r1
        Lb3:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r1
    }

    @Override // p249o7.InterfaceC5017i3
    /* renamed from: b */
    public void mo812b(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
            r8 = this;
            java.lang.Object r9 = r8.f1482a0
            o7.m6 r9 = (p249o7.C5052m6) r9
            java.lang.Object r13 = r8.f1481Z
            java.lang.String r13 = (java.lang.String) r13
            o7.f4 r13 = r9.mo3160b()
            r13.mo3183i()
            r9.m11348g()
            r13 = 0
            if (r12 != 0) goto L17
            byte[] r12 = new byte[r13]     // Catch: java.lang.Throwable -> L17d
        L17:
            java.util.List<java.lang.Long> r0 = r9.f19883x     // Catch: java.lang.Throwable -> L17d
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L17d
            r1 = 0
            r9.f19883x = r1     // Catch: java.lang.Throwable -> L17d
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r2) goto L2b
            if (r10 != r3) goto L12d
            r10 = 204(0xcc, float:2.86E-43)
        L2b:
            if (r11 != 0) goto L12d
            o7.w5 r11 = r9.f19868i     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.p3 r11 = r11.f20154i     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            u6.c r2 = r9.mo3163e()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            u6.d r2 = (p353u6.C6341d) r2     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            java.util.Objects.requireNonNull(r2)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r11.m11411b(r2)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.w5 r11 = r9.f19868i     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.p3 r11 = r11.f20155j     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r2 = 0
            r11.m11411b(r2)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r9.m11334D()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            com.google.android.gms.measurement.internal.b r11 = r9.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.f3 r11 = r11.f5680n     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            int r12 = r12.length     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r11.m11171e(r4, r10, r12)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.j r10 = r9.f19862c     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            p249o7.C5052m6.m11327I(r10)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r10.m11267R()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> Lf6
        L6d:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Lf6
            if (r11 == 0) goto Lc4
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Lf6
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> Lf6
            o7.j r12 = r9.f19862c     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            p249o7.C5052m6.m11327I(r12)     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            long r4 = r11.longValue()     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            r12.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            r12.m11247j()     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            android.database.sqlite.SQLiteDatabase r0 = r12.m11253D()     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            r7[r13] = r4     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid=?"
            int r0 = r0.delete(r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lf6
            if (r0 != r6) goto La0
            goto L6d
        La0:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lf6
            java.lang.String r4 = "Deleted fewer rows from queue than expected"
            r0.<init>(r4)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lf6
            throw r0     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lf6
        La8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            com.google.android.gms.measurement.internal.b r12 = r12.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            o7.f3 r12 = r12.f5672f     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            java.lang.String r4 = "Failed to delete a bundle in a queue table"
            r12.m11170d(r4, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
            throw r0     // Catch: android.database.sqlite.SQLiteException -> Lb7 java.lang.Throwable -> Lf6
        Lb7:
            r12 = move-exception
            java.util.List<java.lang.Long> r0 = r9.f19884y     // Catch: java.lang.Throwable -> Lf6
            if (r0 == 0) goto Lc3
            boolean r11 = r0.contains(r11)     // Catch: java.lang.Throwable -> Lf6
            if (r11 == 0) goto Lc3
            goto L6d
        Lc3:
            throw r12     // Catch: java.lang.Throwable -> Lf6
        Lc4:
            o7.j r10 = r9.f19862c     // Catch: java.lang.Throwable -> Lf6
            p249o7.C5052m6.m11327I(r10)     // Catch: java.lang.Throwable -> Lf6
            r10.m11273o()     // Catch: java.lang.Throwable -> Lf6
            o7.j r10 = r9.f19862c     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            p249o7.C5052m6.m11327I(r10)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r10.m11269T()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r9.f19884y = r1     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            o7.k3 r10 = r9.f19861b     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            p249o7.C5052m6.m11327I(r10)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            boolean r10 = r10.m11288n()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            if (r10 == 0) goto Leb
            boolean r10 = r9.m11337G()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            if (r10 == 0) goto Leb
            r9.m11361t()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            goto Lf2
        Leb:
            r10 = -1
            r9.f19885z = r10     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r9.m11334D()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
        Lf2:
            r9.f19874o = r2     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            goto L177
        Lf6:
            r10 = move-exception
            o7.j r11 = r9.f19862c     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            p249o7.C5052m6.m11327I(r11)     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            r11.m11269T()     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
            throw r10     // Catch: android.database.sqlite.SQLiteException -> L100 java.lang.Throwable -> L17d
        L100:
            r10 = move-exception
            com.google.android.gms.measurement.internal.b r11 = r9.mo3162d()     // Catch: java.lang.Throwable -> L17d
            o7.f3 r11 = r11.f5672f     // Catch: java.lang.Throwable -> L17d
            java.lang.String r12 = "Database error while trying to delete uploaded bundles"
            r11.m11170d(r12, r10)     // Catch: java.lang.Throwable -> L17d
            u6.c r10 = r9.mo3163e()     // Catch: java.lang.Throwable -> L17d
            u6.d r10 = (p353u6.C6341d) r10     // Catch: java.lang.Throwable -> L17d
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> L17d
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L17d
            r9.f19874o = r10     // Catch: java.lang.Throwable -> L17d
            com.google.android.gms.measurement.internal.b r10 = r9.mo3162d()     // Catch: java.lang.Throwable -> L17d
            o7.f3 r10 = r10.f5680n     // Catch: java.lang.Throwable -> L17d
            java.lang.String r11 = "Disable upload, time"
            long r0 = r9.f19874o     // Catch: java.lang.Throwable -> L17d
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L17d
            r10.m11170d(r11, r12)     // Catch: java.lang.Throwable -> L17d
            goto L177
        L12d:
            com.google.android.gms.measurement.internal.b r12 = r9.mo3162d()     // Catch: java.lang.Throwable -> L17d
            o7.f3 r12 = r12.f5680n     // Catch: java.lang.Throwable -> L17d
            java.lang.String r1 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L17d
            r12.m11171e(r1, r2, r11)     // Catch: java.lang.Throwable -> L17d
            o7.w5 r11 = r9.f19868i     // Catch: java.lang.Throwable -> L17d
            o7.p3 r11 = r11.f20155j     // Catch: java.lang.Throwable -> L17d
            u6.c r12 = r9.mo3163e()     // Catch: java.lang.Throwable -> L17d
            u6.d r12 = (p353u6.C6341d) r12     // Catch: java.lang.Throwable -> L17d
            java.util.Objects.requireNonNull(r12)     // Catch: java.lang.Throwable -> L17d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17d
            r11.m11411b(r1)     // Catch: java.lang.Throwable -> L17d
            r11 = 503(0x1f7, float:7.05E-43)
            if (r10 == r11) goto L158
            r11 = 429(0x1ad, float:6.01E-43)
            if (r10 != r11) goto L16c
        L158:
            o7.w5 r10 = r9.f19868i     // Catch: java.lang.Throwable -> L17d
            o7.p3 r10 = r10.f20153h     // Catch: java.lang.Throwable -> L17d
            u6.c r11 = r9.mo3163e()     // Catch: java.lang.Throwable -> L17d
            u6.d r11 = (p353u6.C6341d) r11     // Catch: java.lang.Throwable -> L17d
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> L17d
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17d
            r10.m11411b(r11)     // Catch: java.lang.Throwable -> L17d
        L16c:
            o7.j r10 = r9.f19862c     // Catch: java.lang.Throwable -> L17d
            p249o7.C5052m6.m11327I(r10)     // Catch: java.lang.Throwable -> L17d
            r10.m11270U(r0)     // Catch: java.lang.Throwable -> L17d
            r9.m11334D()     // Catch: java.lang.Throwable -> L17d
        L177:
            r9.f19879t = r13
            r9.m11331A()
            return
        L17d:
            r10 = move-exception
            r9.f19879t = r13
            r9.m11331A()
            throw r10
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public void mo813c(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object r0 = r3.f1481Z
            com.google.android.gms.cast.d r0 = (com.google.android.gms.cast.C1060d) r0
            java.lang.Object r1 = r3.f1482a0
            java.lang.String r1 = (java.lang.String) r1
            h6.e0 r4 = (p123h6.C2496e0) r4
            s7.j r5 = (p327s7.C5986j) r5
            r0.m2963i()
            android.os.IInterface r4 = r4.m11053y()
            h6.e r4 = (p123h6.C2495e) r4
            android.os.Parcel r2 = r4.m3834k2()
            r2.writeString(r1)
            r1 = 5
            r4.m3838o2(r1, r2)
            java.lang.Object r4 = r0.f5427r
            monitor-enter(r4)
            s7.j<com.google.android.gms.common.api.Status> r1 = r0.f5424o     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L33
            r0 = 2001(0x7d1, float:2.804E-42)
            l6.b r0 = com.google.android.gms.cast.C1060d.m2960g(r0)     // Catch: java.lang.Throwable -> L37
            s7.q<TResult> r5 = r5.f23075a     // Catch: java.lang.Throwable -> L37
            r5.m12472q(r0)     // Catch: java.lang.Throwable -> L37
            goto L35
        L33:
            r0.f5424o = r5     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    @Override // p180k2.InterfaceC3669a
    /* renamed from: d */
    public boolean mo814d(java.lang.Object r4, java.io.File r5, p180k2.C3673e r6) {
            r3 = this;
            m2.w r4 = (p214m2.InterfaceC4345w) r4
            java.lang.Object r0 = r3.f1482a0
            k2.g r0 = (p180k2.InterfaceC3675g) r0
            t2.d r1 = new t2.d
            java.lang.Object r4 = r4.get()
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            java.lang.Object r2 = r3.f1481Z
            n2.c r2 = (p229n2.InterfaceC4673c) r2
            r1.<init>(r4, r2)
            boolean r4 = r0.mo814d(r1, r5, r6)
            return r4
    }

    @Override // p090f6.InterfaceC2066a
    /* renamed from: e */
    public void mo815e(android.graphics.Bitmap r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1481Z
            androidx.appcompat.widget.x r0 = (androidx.appcompat.widget.C0311x) r0
            r0.f1482a0 = r3
            java.lang.Object r3 = r2.f1482a0
            r1 = r3
            com.google.android.gms.cast.framework.media.MediaNotificationService r1 = (com.google.android.gms.cast.framework.media.MediaNotificationService) r1
            r1.f5469j0 = r0
            com.google.android.gms.cast.framework.media.MediaNotificationService r3 = (com.google.android.gms.cast.framework.media.MediaNotificationService) r3
            r3.m2984c()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i r7) {
            r6 = this;
            int r0 = r6.f1480Y
            switch(r0) {
                case 13: goto Lcf;
                case 26: goto La3;
                case 27: goto L7;
                default: goto L5;
            }
        L5:
            goto L104
        L7:
            java.lang.Object r0 = r6.f1481Z
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            java.lang.Object r1 = r6.f1482a0
            java.lang.String r1 = (java.lang.String) r1
            db.z r2 = r0.f6612f
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r0, r7)
            monitor-enter(r2)
            java.util.Map<java.lang.String, s7.i<java.lang.String>> r7 = r2.f7107b     // Catch: java.lang.Throwable -> La0
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> La0
            s7.i r7 = (p327s7.AbstractC5985i) r7     // Catch: java.lang.Throwable -> La0
            r0 = 3
            if (r7 == 0) goto L46
            java.lang.String r3 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r3, r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9e
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "Joining ongoing request for: "
            int r3 = r0.length()     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L3b
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> La0
            goto L40
        L3b:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> La0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
        L40:
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> La0
            goto L9e
        L46:
            java.lang.String r7 = "FirebaseMessaging"
            boolean r7 = android.util.Log.isLoggable(r7, r0)     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L69
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "Making new request for: "
            int r4 = r7.length()     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L5f
            java.lang.String r7 = r0.concat(r7)     // Catch: java.lang.Throwable -> La0
            goto L64
        L5f:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> La0
            r7.<init>(r0)     // Catch: java.lang.Throwable -> La0
        L64:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r7)     // Catch: java.lang.Throwable -> La0
        L69:
            java.lang.Object r7 = r3.f1481Z     // Catch: java.lang.Throwable -> La0
            com.google.firebase.messaging.FirebaseMessaging r7 = (com.google.firebase.messaging.FirebaseMessaging) r7     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r3.f1482a0     // Catch: java.lang.Throwable -> La0
            s7.i r0 = (p327s7.AbstractC5985i) r0     // Catch: java.lang.Throwable -> La0
            db.r r7 = r7.f6611e     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r0.mo12451i()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La0
            o9.d r3 = r7.f7085a     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = p057db.C1421v.m3946b(r3)     // Catch: java.lang.Throwable -> La0
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "*"
            s7.i r0 = r7.m3942b(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> La0
            s7.i r7 = r7.m3941a(r0)     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.Executor r0 = r2.f7106a     // Catch: java.lang.Throwable -> La0
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x     // Catch: java.lang.Throwable -> La0
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> La0
            s7.i r7 = r7.mo12449g(r0, r3)     // Catch: java.lang.Throwable -> La0
            java.util.Map<java.lang.String, s7.i<java.lang.String>> r0 = r2.f7107b     // Catch: java.lang.Throwable -> La0
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r2)
            return r7
        La0:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        La3:
            java.lang.Object r0 = r6.f1481Z
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.f1482a0
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = p057db.C1409l.f7068b
            boolean r2 = p353u6.C6345h.m12995a()
            if (r2 == 0) goto Lce
            java.lang.Object r2 = r7.mo12451i()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 402(0x192, float:5.63E-43)
            if (r2 == r3) goto Lc2
            goto Lce
        Lc2:
            s7.i r7 = p057db.C1409l.m3932a(r0, r1)
            java.util.concurrent.Executor r0 = p057db.ExecutorC1405j.f7063Y
            s7.a r1 = p057db.C1407k.f7065Y
            s7.i r7 = r7.mo12447e(r0, r1)
        Lce:
            return r7
        Lcf:
            java.lang.Object r0 = r6.f1481Z
            j6.c r0 = (p164j6.C3429c) r0
            java.lang.Object r1 = r6.f1482a0
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r7.mo12455m()
            if (r2 != 0) goto Le1
            goto L103
        Le1:
            java.lang.Object r2 = r7.mo12451i()
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto Lf3
            java.lang.String r3 = "google.messenger"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto Lf3
            r2 = 1
            goto Lf4
        Lf3:
            r2 = 0
        Lf4:
            if (r2 != 0) goto Lf7
            goto L103
        Lf7:
            s7.i r7 = r0.m7886b(r1)
            java.util.concurrent.Executor r0 = p164j6.ExecutorC3447u.f14918Y
            s7.h r1 = p164j6.C3444r.f14913Y
            s7.i r7 = r7.mo12456n(r0, r1)
        L103:
            return r7
        L104:
            java.lang.Object r0 = r6.f1481Z
            db.z r0 = (p057db.C1425z) r0
            java.lang.Object r1 = r6.f1482a0
            java.lang.String r1 = (java.lang.String) r1
            monitor-enter(r0)
            java.util.Map<java.lang.String, s7.i<java.lang.String>> r2 = r0.f7107b     // Catch: java.lang.Throwable -> L114
            r2.remove(r1)     // Catch: java.lang.Throwable -> L114
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L114
            return r7
        L114:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L114
            throw r7
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r3 = this;
            java.lang.Object r0 = r3.f1481Z
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r3.f1482a0
            bh.a r1 = (bh.InterfaceC0769a) r1
            java.lang.Object r1 = r1.get()
            x3.g r2 = new x3.g
            x3.e r1 = (p405x3.C6923e) r1
            r2.<init>(r0, r1)
            return r2
    }

    @Override // p243o1.InterfaceC4875e
    /* renamed from: h */
    public java.lang.String mo817h() {
            r1 = this;
            java.lang.Object r0 = r1.f1481Z
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // p243o1.InterfaceC4875e
    /* renamed from: i */
    public void mo818i(p243o1.InterfaceC4874d r7) {
            r6 = this;
            java.lang.Object r0 = r6.f1482a0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 != 0) goto L8
            goto Lba
        L8:
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto Lba
            r3 = r0[r2]
            int r2 = r2 + 1
            if (r3 != 0) goto L19
            r3 = r7
            k1.u r3 = (p179k1.C3663u) r3
            r3.mo8103B(r2)
            goto La
        L19:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L26
            byte[] r3 = (byte[]) r3
            r4 = r7
            k1.u r4 = (p179k1.C3663u) r4
            r4.mo8107g0(r2, r3)
            goto La
        L26:
            boolean r4 = r3 instanceof java.lang.Float
            if (r4 == 0) goto L32
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            double r3 = (double) r3
            goto L3c
        L32:
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 == 0) goto L43
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
        L3c:
            r5 = r7
            k1.u r5 = (p179k1.C3663u) r5
            r5.mo8104D(r2, r3)
            goto La
        L43:
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L4e
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            goto L8e
        L4e:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L59
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L6e
        L59:
            boolean r4 = r3 instanceof java.lang.Short
            if (r4 == 0) goto L64
            java.lang.Short r3 = (java.lang.Short) r3
            short r3 = r3.shortValue()
            goto L6e
        L64:
            boolean r4 = r3 instanceof java.lang.Byte
            if (r4 == 0) goto L70
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
        L6e:
            long r3 = (long) r3
            goto L8e
        L70:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L7d
            java.lang.String r3 = (java.lang.String) r3
            r4 = r7
            k1.u r4 = (p179k1.C3663u) r4
            r4.mo8108u(r2, r3)
            goto La
        L7d:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L96
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8c
            r3 = 1
            goto L8e
        L8c:
            r3 = 0
        L8e:
            r5 = r7
            k1.u r5 = (p179k1.C3663u) r5
            r5.mo8105X(r2, r3)
            goto La
        L96:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot bind "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " at index "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " Supported types: null, byte[], float, double, long, int, short, byte, string"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lba:
            return
    }

    /* renamed from: j */
    public void m819j() {
            r1 = this;
            r0 = 0
            r1.f1481Z = r0
            r1.f1482a0 = r0
            return
    }

    /* renamed from: k */
    public boolean m820k() {
            r3 = this;
            java.io.File r0 = r3.m822m()     // Catch: java.io.IOException -> L9
            boolean r0 = r0.createNewFile()     // Catch: java.io.IOException -> L9
            goto L21
        L9:
            r0 = move-exception
            java.lang.String r1 = "Error creating marker: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Object r2 = r3.f1481Z
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
        L21:
            return r0
    }

    /* renamed from: l */
    public java.util.Map<p180k2.InterfaceC3671c, p214m2.C4335m<?>> m821l(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.Object r1 = r0.f1482a0
            goto L7
        L5:
            java.lang.Object r1 = r0.f1481Z
        L7:
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    /* renamed from: m */
    public java.io.File m822m() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.Object r1 = r3.f1482a0
            k7.h4 r1 = (p185k7.C3827h4) r1
            java.io.File r1 = r1.m8568b()
            java.lang.Object r2 = r3.f1481Z
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: n */
    public android.view.textclassifier.TextClassifier m823n() {
            r2 = this;
            java.lang.Object r0 = r2.f1482a0
            r1 = r0
            android.view.textclassifier.TextClassifier r1 = (android.view.textclassifier.TextClassifier) r1
            if (r1 != 0) goto L21
            java.lang.Object r0 = r2.f1481Z
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r0 = r0.getContext()
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r1 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.textclassifier.TextClassificationManager r0 = (android.view.textclassifier.TextClassificationManager) r0
            if (r0 == 0) goto L1e
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
        L1e:
            android.view.textclassifier.TextClassifier r0 = android.view.textclassifier.TextClassifier.NO_OP
            return r0
        L21:
            android.view.textclassifier.TextClassifier r0 = (android.view.textclassifier.TextClassifier) r0
            return r0
    }

    /* renamed from: o */
    public byte[] m824o() {
            r6 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r6.f1481Z     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r6.f1482a0     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L16
            byte[] r0 = p074e9.C1805a.m4522g(r2)     // Catch: java.lang.Throwable -> L2a
            return r0
        L16:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "can't read keyset; the pref value %s does not exist"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r6.f1482a0     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2a
            r4[r0] = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L2a:
            java.io.CharConversionException r2 = new java.io.CharConversionException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r6.f1482a0
            java.lang.String r3 = (java.lang.String) r3
            r1[r0] = r3
            java.lang.String r0 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: p */
    public void m825p() {
            r3 = this;
            java.lang.Object r0 = r3.f1482a0     // Catch: java.io.IOException -> Lf
            java.nio.channels.FileLock r0 = (java.nio.channels.FileLock) r0     // Catch: java.io.IOException -> Lf
            r0.release()     // Catch: java.io.IOException -> Lf
            java.lang.Object r0 = r3.f1481Z     // Catch: java.io.IOException -> Lf
            java.nio.channels.FileChannel r0 = (java.nio.channels.FileChannel) r0     // Catch: java.io.IOException -> Lf
            r0.close()     // Catch: java.io.IOException -> Lf
            goto L17
        Lf:
            r0 = move-exception
            java.lang.String r1 = "CrossProcessLock"
            java.lang.String r2 = "encountered error while releasing, ignoring"
            android.util.Log.e(r1, r2, r0)
        L17:
            return
    }

    /* renamed from: r */
    public p185k7.InterfaceC3916o m826r(p365v.C6476c r3, p185k7.InterfaceC3916o r4) {
            r2 = this;
            p124h7.C2939x3.m7251A(r3)
            boolean r0 = r4 instanceof p185k7.C3929p
            if (r0 == 0) goto L2b
            k7.p r4 = (p185k7.C3929p) r4
            java.util.ArrayList<k7.o> r0 = r4.f16826Z
            java.lang.String r4 = r4.f16825Y
            java.lang.Object r1 = r2.f1481Z
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L22
            java.lang.Object r1 = r2.f1481Z
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r4)
            k7.u r1 = (p185k7.AbstractC3994u) r1
            goto L26
        L22:
            java.lang.Object r1 = r2.f1482a0
            k7.a0 r1 = (p185k7.C3725a0) r1
        L26:
            k7.o r3 = r1.mo8180a(r4, r3, r0)
            return r3
        L2b:
            return r4
    }

    @Override // p180k2.InterfaceC3675g
    /* renamed from: s */
    public com.bumptech.glide.load.EnumC1010c mo827s(p180k2.C3673e r2) {
            r1 = this;
            java.lang.Object r0 = r1.f1482a0
            k2.g r0 = (p180k2.InterfaceC3675g) r0
            com.bumptech.glide.load.c r2 = r0.mo827s(r2)
            return r2
    }

    /* renamed from: t */
    public java.lang.String m828t(java.lang.String r6) {
            r5 = this;
            java.lang.Object r0 = r5.f1482a0
            h7.l3 r0 = (p124h7.C2723l3) r0
            r1 = 0
            if (r0 == 0) goto L58
            monitor-enter(r0)     // Catch: java.io.UnsupportedEncodingException -> L35 java.security.GeneralSecurityException -> L37
            java.lang.Object r2 = r5.f1482a0     // Catch: java.lang.Throwable -> L32
            h7.l3 r2 = (p124h7.C2723l3) r2     // Catch: java.lang.Throwable -> L32
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L32
            h7.t1 r3 = r2.f11731b     // Catch: java.lang.Throwable -> L2f
            f.t r3 = r3.m7148b()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Class<h7.n1> r2 = p124h7.InterfaceC2757n1.class
            java.lang.Object r2 = r3.m4783G(r2)     // Catch: java.lang.Throwable -> L32
            h7.n1 r2 = (p124h7.InterfaceC2757n1) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L32
            r4 = 8
            byte[] r6 = android.util.Base64.decode(r6, r4)     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r2.mo6689a(r6, r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "UTF-8"
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r3
        L2f:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.io.UnsupportedEncodingException -> L35 java.security.GeneralSecurityException -> L37
        L35:
            r6 = move-exception
            goto L38
        L37:
            r6 = move-exception
        L38:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Exception encountered while decrypting bytes:\n"
            int r2 = r6.length()
            if (r2 == 0) goto L4d
            java.lang.String r6 = r0.concat(r6)
            goto L52
        L4d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L52:
            java.lang.String r0 = "FirebearCryptoHelper"
            android.util.Log.e(r0, r6)
            return r1
        L58:
            java.lang.String r6 = "FirebearCryptoHelper"
            java.lang.String r0 = "KeysetManager failed to initialize - unable to decrypt payload"
            android.util.Log.e(r6, r0)
            return r1
    }

    /* renamed from: u */
    public void m829u(p185k7.AbstractC3994u r4) {
            r3 = this;
            java.util.List<k7.b0> r0 = r4.f16877a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            k7.b0 r1 = (p185k7.EnumC3739b0) r1
            int r1 = r1.f16528Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r3.f1481Z
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r1, r4)
            goto L6
        L24:
            return
    }

    /* renamed from: v */
    public void m830v(p365v.C6476c r6, androidx.fragment.app.C0392l0 r7) {
            r5 = this;
            k7.z6 r0 = new k7.z6
            r0.<init>(r7)
            java.lang.Object r1 = r5.f1481Z
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r7.f2231a0
            k7.b r3 = (p185k7.C3738b) r3
            k7.b r3 = r3.m8218a()
            java.lang.Object r4 = r5.f1481Z
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            java.lang.Object r2 = r4.get(r2)
            k7.n r2 = (p185k7.C3903n) r2
            int r2 = m810w(r6, r2, r0)
            r4 = 2
            if (r2 == r4) goto L39
            r4 = -1
            if (r2 != r4) goto L11
        L39:
            r7.f2231a0 = r3
            goto L11
        L3c:
            java.lang.Object r7 = r5.f1482a0
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r7.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r5.f1482a0
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            java.lang.Object r1 = r2.get(r1)
            k7.n r1 = (p185k7.C3903n) r1
            m810w(r6, r1, r0)
            goto L48
        L62:
            return
    }

    /* renamed from: x */
    public java.lang.String m831x() {
            r6 = this;
            java.lang.Object r0 = r6.f1482a0
            h7.l3 r0 = (p124h7.C2723l3) r0
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FirebearCryptoHelper"
            java.lang.String r2 = "KeysetManager failed to initialize - unable to get Public key"
            android.util.Log.e(r0, r2)
            return r1
        Lf:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            f.t r2 = new f.t
            r2.<init>(r0)
            java.lang.Object r3 = r6.f1482a0     // Catch: java.io.IOException -> L43 java.security.GeneralSecurityException -> L45
            h7.l3 r3 = (p124h7.C2723l3) r3     // Catch: java.io.IOException -> L43 java.security.GeneralSecurityException -> L45
            monitor-enter(r3)     // Catch: java.io.IOException -> L43 java.security.GeneralSecurityException -> L45
            java.lang.Object r4 = r6.f1482a0     // Catch: java.lang.Throwable -> L40
            h7.l3 r4 = (p124h7.C2723l3) r4     // Catch: java.lang.Throwable -> L40
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L40
            h7.t1 r5 = r4.f11731b     // Catch: java.lang.Throwable -> L3d
            f.t r5 = r5.m7148b()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            f.t r4 = r5.m4782C()     // Catch: java.lang.Throwable -> L40
            r4.m4785J(r2)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            byte[] r0 = r0.toByteArray()
            r1 = 8
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
        L3d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.io.IOException -> L43 java.security.GeneralSecurityException -> L45
        L43:
            r0 = move-exception
            goto L46
        L45:
            r0 = move-exception
        L46:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Exception encountered when attempting to get Public Key:\n"
            int r3 = r0.length()
            if (r3 == 0) goto L5b
            java.lang.String r0 = r2.concat(r0)
            goto L60
        L5b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L60:
            java.lang.String r2 = "FirebearCryptoHelper"
            android.util.Log.e(r2, r0)
            return r1
    }
}
