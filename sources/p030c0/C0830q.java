package p030c0;

/* renamed from: c0.q */
/* loaded from: classes.dex */
public final class C0830q {

    /* renamed from: c */
    public static final java.lang.Object f4494c = null;

    /* renamed from: d */
    public static java.lang.String f4495d;

    /* renamed from: e */
    public static java.util.Set<java.lang.String> f4496e;

    /* renamed from: f */
    public static final java.lang.Object f4497f = null;

    /* renamed from: g */
    public static p030c0.C0830q.c f4498g;

    /* renamed from: a */
    public final android.content.Context f4499a;

    /* renamed from: b */
    public final android.app.NotificationManager f4500b;

    /* renamed from: c0.q$a */
    public static class a implements p030c0.C0830q.d {

        /* renamed from: a */
        public final java.lang.String f4501a;

        /* renamed from: b */
        public final int f4502b;

        /* renamed from: c */
        public final java.lang.String f4503c;

        /* renamed from: d */
        public final android.app.Notification f4504d;

        public a(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) {
                r0 = this;
                r0.<init>()
                r0.f4501a = r1
                r0.f4502b = r2
                r0.f4503c = r3
                r0.f4504d = r4
                return
        }

        @Override // p030c0.C0830q.d
        /* renamed from: a */
        public void mo2498a(p000a.InterfaceC0000a r5) {
                r4 = this;
                java.lang.String r0 = r4.f4501a
                int r1 = r4.f4502b
                java.lang.String r2 = r4.f4503c
                android.app.Notification r3 = r4.f4504d
                r5.mo0S1(r0, r1, r2, r3)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotifyTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                r0.append(r1)
                java.lang.String r1 = r3.f4501a
                r0.append(r1)
                java.lang.String r1 = ", id:"
                r0.append(r1)
                int r1 = r3.f4502b
                r0.append(r1)
                java.lang.String r1 = ", tag:"
                r0.append(r1)
                java.lang.String r1 = r3.f4503c
                java.lang.String r2 = "]"
                java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: c0.q$b */
    public static class b {

        /* renamed from: a */
        public final android.content.ComponentName f4505a;

        /* renamed from: b */
        public final android.os.IBinder f4506b;

        public b(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.<init>()
                r0.f4505a = r1
                r0.f4506b = r2
                return
        }
    }

    /* renamed from: c0.q$c */
    public static class c implements android.os.Handler.Callback, android.content.ServiceConnection {

        /* renamed from: Y */
        public final android.content.Context f4507Y;

        /* renamed from: Z */
        public final android.os.Handler f4508Z;

        /* renamed from: a0 */
        public final java.util.Map<android.content.ComponentName, p030c0.C0830q.c.a> f4509a0;

        /* renamed from: b0 */
        public java.util.Set<java.lang.String> f4510b0;

        /* renamed from: c0.q$c$a */
        public static class a {

            /* renamed from: a */
            public final android.content.ComponentName f4511a;

            /* renamed from: b */
            public boolean f4512b;

            /* renamed from: c */
            public p000a.InterfaceC0000a f4513c;

            /* renamed from: d */
            public java.util.ArrayDeque<p030c0.C0830q.d> f4514d;

            /* renamed from: e */
            public int f4515e;

            public a(android.content.ComponentName r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 0
                    r2.f4512b = r0
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r2.f4514d = r1
                    r2.f4515e = r0
                    r2.f4511a = r3
                    return
            }
        }

        public c(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f4509a0 = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f4510b0 = r0
                r1.f4507Y = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r0 = "NotificationManagerCompat"
                r2.<init>(r0)
                r2.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r2, r1)
                r1.f4508Z = r0
                return
        }

        /* renamed from: a */
        public final void m2499a(p030c0.C0830q.c.a r6) {
                r5 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L2e
                java.lang.String r2 = "Processing component "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                android.content.ComponentName r3 = r6.f4511a
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                java.util.ArrayDeque<c0.q$d> r3 = r6.f4514d
                int r3 = r3.size()
                r2.append(r3)
                java.lang.String r3 = " queued tasks"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r0, r2)
            L2e:
                java.util.ArrayDeque<c0.q$d> r2 = r6.f4514d
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L37
                return
            L37:
                boolean r2 = r6.f4512b
                if (r2 == 0) goto L3d
                r2 = 1
                goto L73
            L3d:
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r2.<init>(r3)
                android.content.ComponentName r3 = r6.f4511a
                android.content.Intent r2 = r2.setComponent(r3)
                android.content.Context r3 = r5.f4507Y
                r4 = 33
                boolean r2 = r3.bindService(r2, r5, r4)
                r6.f4512b = r2
                if (r2 == 0) goto L5a
                r2 = 0
                r6.f4515e = r2
                goto L71
            L5a:
                java.lang.String r2 = "Unable to bind to listener "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                android.content.ComponentName r3 = r6.f4511a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2)
                android.content.Context r2 = r5.f4507Y
                r2.unbindService(r5)
            L71:
                boolean r2 = r6.f4512b
            L73:
                if (r2 == 0) goto Le3
                a.a r2 = r6.f4513c
                if (r2 != 0) goto L7a
                goto Le3
            L7a:
                java.util.ArrayDeque<c0.q$d> r2 = r6.f4514d
                java.lang.Object r2 = r2.peek()
                c0.q$d r2 = (p030c0.C0830q.d) r2
                if (r2 != 0) goto L85
                goto Ld7
            L85:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                if (r3 == 0) goto L9f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                r3.<init>()     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                java.lang.String r4 = "Sending task "
                r3.append(r4)     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                r3.append(r2)     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                android.util.Log.d(r0, r3)     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
            L9f:
                a.a r3 = r6.f4513c     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                r2.mo2498a(r3)     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                java.util.ArrayDeque<c0.q$d> r2 = r6.f4514d     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                r2.remove()     // Catch: android.os.RemoteException -> Laa android.os.DeadObjectException -> Lbe
                goto L7a
            Laa:
                r1 = move-exception
                java.lang.String r2 = "RemoteException communicating with "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                android.content.ComponentName r3 = r6.f4511a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2, r1)
                goto Ld7
            Lbe:
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto Ld7
                java.lang.String r1 = "Remote service has died: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                android.content.ComponentName r2 = r6.f4511a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            Ld7:
                java.util.ArrayDeque<c0.q$d> r0 = r6.f4514d
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Le2
                r5.m2500b(r6)
            Le2:
                return
            Le3:
                r5.m2500b(r6)
                return
        }

        /* renamed from: b */
        public final void m2500b(p030c0.C0830q.c.a r6) {
                r5 = this;
                android.os.Handler r0 = r5.f4508Z
                android.content.ComponentName r1 = r6.f4511a
                r2 = 3
                boolean r0 = r0.hasMessages(r2, r1)
                if (r0 == 0) goto Lc
                return
            Lc:
                int r0 = r6.f4515e
                r1 = 1
                int r0 = r0 + r1
                r6.f4515e = r0
                r3 = 6
                java.lang.String r4 = "NotifManCompat"
                if (r0 <= r3) goto L4c
                java.lang.String r0 = "Giving up on delivering "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.util.ArrayDeque<c0.q$d> r1 = r6.f4514d
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = " tasks to "
                r0.append(r1)
                android.content.ComponentName r1 = r6.f4511a
                r0.append(r1)
                java.lang.String r1 = " after "
                r0.append(r1)
                int r1 = r6.f4515e
                r0.append(r1)
                java.lang.String r1 = " retries"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r4, r0)
                java.util.ArrayDeque<c0.q$d> r6 = r6.f4514d
                r6.clear()
                return
            L4c:
                int r0 = r0 - r1
                int r0 = r1 << r0
                int r0 = r0 * 1000
                boolean r1 = android.util.Log.isLoggable(r4, r2)
                if (r1 == 0) goto L70
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Scheduling retry for "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " ms"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r4, r1)
            L70:
                android.os.Handler r1 = r5.f4508Z
                android.content.ComponentName r6 = r6.f4511a
                android.os.Message r6 = r1.obtainMessage(r2, r6)
                android.os.Handler r1 = r5.f4508Z
                long r2 = (long) r0
                r1.sendMessageDelayed(r6, r2)
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r13) {
                r12 = this;
                int r0 = r13.what
                r1 = 3
                r2 = 0
                r3 = 0
                r4 = 1
                if (r0 == 0) goto L72
                if (r0 == r4) goto L3e
                r5 = 2
                if (r0 == r5) goto L22
                if (r0 == r1) goto L10
                return r3
            L10:
                java.lang.Object r13 = r13.obj
                android.content.ComponentName r13 = (android.content.ComponentName) r13
                java.util.Map<android.content.ComponentName, c0.q$c$a> r0 = r12.f4509a0
                java.lang.Object r13 = r0.get(r13)
                c0.q$c$a r13 = (p030c0.C0830q.c.a) r13
                if (r13 == 0) goto L21
                r12.m2499a(r13)
            L21:
                return r4
            L22:
                java.lang.Object r13 = r13.obj
                android.content.ComponentName r13 = (android.content.ComponentName) r13
                java.util.Map<android.content.ComponentName, c0.q$c$a> r0 = r12.f4509a0
                java.lang.Object r13 = r0.get(r13)
                c0.q$c$a r13 = (p030c0.C0830q.c.a) r13
                if (r13 == 0) goto L3d
                boolean r0 = r13.f4512b
                if (r0 == 0) goto L3b
                android.content.Context r0 = r12.f4507Y
                r0.unbindService(r12)
                r13.f4512b = r3
            L3b:
                r13.f4513c = r2
            L3d:
                return r4
            L3e:
                java.lang.Object r13 = r13.obj
                c0.q$b r13 = (p030c0.C0830q.b) r13
                android.content.ComponentName r0 = r13.f4505a
                android.os.IBinder r13 = r13.f4506b
                java.util.Map<android.content.ComponentName, c0.q$c$a> r1 = r12.f4509a0
                java.lang.Object r0 = r1.get(r0)
                c0.q$c$a r0 = (p030c0.C0830q.c.a) r0
                if (r0 == 0) goto L71
                int r1 = p000a.InterfaceC0000a.a.f0a
                if (r13 != 0) goto L55
                goto L6a
            L55:
                java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                android.os.IInterface r1 = r13.queryLocalInterface(r1)
                if (r1 == 0) goto L65
                boolean r2 = r1 instanceof p000a.InterfaceC0000a
                if (r2 == 0) goto L65
                r2 = r1
                a.a r2 = (p000a.InterfaceC0000a) r2
                goto L6a
            L65:
                a.a$a$a r2 = new a.a$a$a
                r2.<init>(r13)
            L6a:
                r0.f4513c = r2
                r0.f4515e = r3
                r12.m2499a(r0)
            L71:
                return r4
            L72:
                java.lang.Object r13 = r13.obj
                c0.q$d r13 = (p030c0.C0830q.d) r13
                android.content.Context r0 = r12.f4507Y
                java.util.Set r0 = p030c0.C0830q.m2495a(r0)
                java.util.Set<java.lang.String> r5 = r12.f4510b0
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L86
                goto L17c
            L86:
                r12.f4510b0 = r0
                android.content.Context r5 = r12.f4507Y
                android.content.pm.PackageManager r5 = r5.getPackageManager()
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                java.lang.String r7 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                android.content.Intent r6 = r6.setAction(r7)
                java.util.List r5 = r5.queryIntentServices(r6, r3)
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            La6:
                boolean r7 = r5.hasNext()
                java.lang.String r8 = "NotifManCompat"
                if (r7 == 0) goto Lee
                java.lang.Object r7 = r5.next()
                android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
                android.content.pm.ServiceInfo r9 = r7.serviceInfo
                java.lang.String r9 = r9.packageName
                boolean r9 = r0.contains(r9)
                if (r9 != 0) goto Lbf
                goto La6
            Lbf:
                android.content.ComponentName r9 = new android.content.ComponentName
                android.content.pm.ServiceInfo r10 = r7.serviceInfo
                java.lang.String r11 = r10.packageName
                java.lang.String r10 = r10.name
                r9.<init>(r11, r10)
                android.content.pm.ServiceInfo r7 = r7.serviceInfo
                java.lang.String r7 = r7.permission
                if (r7 == 0) goto Lea
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "Permission present on component "
                r7.append(r10)
                r7.append(r9)
                java.lang.String r9 = ", not adding listener record."
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                android.util.Log.w(r8, r7)
                goto La6
            Lea:
                r6.add(r9)
                goto La6
            Lee:
                java.util.Iterator r0 = r6.iterator()
            Lf2:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L12b
                java.lang.Object r5 = r0.next()
                android.content.ComponentName r5 = (android.content.ComponentName) r5
                java.util.Map<android.content.ComponentName, c0.q$c$a> r7 = r12.f4509a0
                boolean r7 = r7.containsKey(r5)
                if (r7 != 0) goto Lf2
                boolean r7 = android.util.Log.isLoggable(r8, r1)
                if (r7 == 0) goto L120
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "Adding listener record for "
                r7.append(r9)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                android.util.Log.d(r8, r7)
            L120:
                java.util.Map<android.content.ComponentName, c0.q$c$a> r7 = r12.f4509a0
                c0.q$c$a r9 = new c0.q$c$a
                r9.<init>(r5)
                r7.put(r5, r9)
                goto Lf2
            L12b:
                java.util.Map<android.content.ComponentName, c0.q$c$a> r0 = r12.f4509a0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L135:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L17c
                java.lang.Object r5 = r0.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r7 = r5.getKey()
                boolean r7 = r6.contains(r7)
                if (r7 != 0) goto L135
                boolean r7 = android.util.Log.isLoggable(r8, r1)
                if (r7 == 0) goto L165
                java.lang.String r7 = "Removing listener record for "
                java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
                java.lang.Object r9 = r5.getKey()
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                android.util.Log.d(r8, r7)
            L165:
                java.lang.Object r5 = r5.getValue()
                c0.q$c$a r5 = (p030c0.C0830q.c.a) r5
                boolean r7 = r5.f4512b
                if (r7 == 0) goto L176
                android.content.Context r7 = r12.f4507Y
                r7.unbindService(r12)
                r5.f4512b = r3
            L176:
                r5.f4513c = r2
                r0.remove()
                goto L135
            L17c:
                java.util.Map<android.content.ComponentName, c0.q$c$a> r0 = r12.f4509a0
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L186:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19b
                java.lang.Object r1 = r0.next()
                c0.q$c$a r1 = (p030c0.C0830q.c.a) r1
                java.util.ArrayDeque<c0.q$d> r2 = r1.f4514d
                r2.add(r13)
                r12.m2499a(r1)
                goto L186
            L19b:
                return r4
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
                r3 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto L1d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Connected to service "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L1d:
                android.os.Handler r0 = r3.f4508Z
                r1 = 1
                c0.q$b r2 = new c0.q$b
                r2.<init>(r4, r5)
                android.os.Message r4 = r0.obtainMessage(r1, r2)
                r4.sendToTarget()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r4) {
                r3 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto L1d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Disconnected from service "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L1d:
                android.os.Handler r0 = r3.f4508Z
                r1 = 2
                android.os.Message r4 = r0.obtainMessage(r1, r4)
                r4.sendToTarget()
                return
        }
    }

    /* renamed from: c0.q$d */
    public interface d {
        /* renamed from: a */
        void mo2498a(p000a.InterfaceC0000a r1);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p030c0.C0830q.f4494c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            p030c0.C0830q.f4496e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p030c0.C0830q.f4497f = r0
            return
    }

    public C0830q(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f4499a = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.f4500b = r2
            return
    }

    /* renamed from: a */
    public static java.util.Set<java.lang.String> m2495a(android.content.Context r6) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r0 = "enabled_notification_listeners"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r0)
            java.lang.Object r0 = p030c0.C0830q.f4494c
            monitor-enter(r0)
            if (r6 == 0) goto L3e
            java.lang.String r1 = p030c0.C0830q.f4495d     // Catch: java.lang.Throwable -> L42
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3e
            java.lang.String r1 = ":"
            r2 = -1
            java.lang.String[] r1 = r6.split(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42
            int r3 = r1.length     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            int r3 = r1.length     // Catch: java.lang.Throwable -> L42
            r4 = 0
        L26:
            if (r4 >= r3) goto L3a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L42
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L37
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L42
            r2.add(r5)     // Catch: java.lang.Throwable -> L42
        L37:
            int r4 = r4 + 1
            goto L26
        L3a:
            p030c0.C0830q.f4496e = r2     // Catch: java.lang.Throwable -> L42
            p030c0.C0830q.f4495d = r6     // Catch: java.lang.Throwable -> L42
        L3e:
            java.util.Set<java.lang.String> r6 = p030c0.C0830q.f4496e     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return r6
        L42:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r6
    }

    /* renamed from: b */
    public void m2496b(int r4, android.app.Notification r5) {
            r3 = this;
            android.os.Bundle r0 = r5.extras
            if (r0 == 0) goto Le
            java.lang.String r1 = "android.support.useSideChannel"
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1 = 0
            if (r0 == 0) goto L26
            c0.q$a r0 = new c0.q$a
            android.content.Context r2 = r3.f4499a
            java.lang.String r2 = r2.getPackageName()
            r0.<init>(r2, r4, r1, r5)
            r3.m2497c(r0)
            android.app.NotificationManager r5 = r3.f4500b
            r5.cancel(r1, r4)
            goto L2b
        L26:
            android.app.NotificationManager r0 = r3.f4500b
            r0.notify(r1, r4, r5)
        L2b:
            return
    }

    /* renamed from: c */
    public final void m2497c(p030c0.C0830q.d r4) {
            r3 = this;
            java.lang.Object r0 = p030c0.C0830q.f4497f
            monitor-enter(r0)
            c0.q$c r1 = p030c0.C0830q.f4498g     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L14
            c0.q$c r1 = new c0.q$c     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.f4499a     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            p030c0.C0830q.f4498g = r1     // Catch: java.lang.Throwable -> L22
        L14:
            c0.q$c r1 = p030c0.C0830q.f4498g     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.f4508Z     // Catch: java.lang.Throwable -> L22
            r2 = 0
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch: java.lang.Throwable -> L22
            r4.sendToTarget()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }
}
