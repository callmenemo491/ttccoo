package androidx.room;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends android.app.Service {

    /* renamed from: Y */
    public int f3644Y;

    /* renamed from: Z */
    public final java.util.HashMap<java.lang.Integer, java.lang.String> f3645Z;

    /* renamed from: a0 */
    public final android.os.RemoteCallbackList<p179k1.InterfaceC3659q> f3646a0;

    /* renamed from: b0 */
    public final p179k1.AbstractBinderC3660r f3647b0;

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class RemoteCallbackListC0616a extends android.os.RemoteCallbackList<p179k1.InterfaceC3659q> {

        /* renamed from: a */
        public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f3648a;

        public RemoteCallbackListC0616a(androidx.room.MultiInstanceInvalidationService r1) {
                r0 = this;
                r0.f3648a = r1
                r0.<init>()
                return
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(android.os.IInterface r1, java.lang.Object r2) {
                r0 = this;
                k1.q r1 = (p179k1.InterfaceC3659q) r1
                androidx.room.MultiInstanceInvalidationService r1 = r0.f3648a
                java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r1.f3645Z
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.remove(r2)
                return
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class BinderC0617b extends p179k1.AbstractBinderC3660r {

        /* renamed from: a */
        public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f3649a;

        public BinderC0617b(androidx.room.MultiInstanceInvalidationService r1) {
                r0 = this;
                r0.f3649a = r1
                r0.<init>()
                return
        }

        /* renamed from: v */
        public void m2141v(int r8, java.lang.String[] r9) {
                r7 = this;
                androidx.room.MultiInstanceInvalidationService r0 = r7.f3649a
                android.os.RemoteCallbackList<k1.q> r0 = r0.f3646a0
                monitor-enter(r0)
                androidx.room.MultiInstanceInvalidationService r1 = r7.f3649a     // Catch: java.lang.Throwable -> L79
                java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r1.f3645Z     // Catch: java.lang.Throwable -> L79
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L79
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L79
                if (r1 != 0) goto L1e
                java.lang.String r8 = "ROOM"
                java.lang.String r9 = "Remote invalidation client ID not registered"
                android.util.Log.w(r8, r9)     // Catch: java.lang.Throwable -> L79
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                return
            L1e:
                androidx.room.MultiInstanceInvalidationService r2 = r7.f3649a     // Catch: java.lang.Throwable -> L79
                android.os.RemoteCallbackList<k1.q> r2 = r2.f3646a0     // Catch: java.lang.Throwable -> L79
                int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L79
                r3 = 0
            L27:
                if (r3 >= r2) goto L70
                androidx.room.MultiInstanceInvalidationService r4 = r7.f3649a     // Catch: java.lang.Throwable -> L67
                android.os.RemoteCallbackList<k1.q> r4 = r4.f3646a0     // Catch: java.lang.Throwable -> L67
                java.lang.Object r4 = r4.getBroadcastCookie(r3)     // Catch: java.lang.Throwable -> L67
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L67
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L67
                androidx.room.MultiInstanceInvalidationService r5 = r7.f3649a     // Catch: java.lang.Throwable -> L67
                java.util.HashMap<java.lang.Integer, java.lang.String> r5 = r5.f3645Z     // Catch: java.lang.Throwable -> L67
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L67
                java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L67
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L67
                if (r8 == r4) goto L64
                boolean r4 = r1.equals(r5)     // Catch: java.lang.Throwable -> L67
                if (r4 != 0) goto L4e
                goto L64
            L4e:
                androidx.room.MultiInstanceInvalidationService r4 = r7.f3649a     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                android.os.RemoteCallbackList<k1.q> r4 = r4.f3646a0     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                android.os.IInterface r4 = r4.getBroadcastItem(r3)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                k1.q r4 = (p179k1.InterfaceC3659q) r4     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                r4.mo8088G0(r9)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L67
                goto L64
            L5c:
                r4 = move-exception
                java.lang.String r5 = "ROOM"
                java.lang.String r6 = "Error invoking a remote callback"
                android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> L67
            L64:
                int r3 = r3 + 1
                goto L27
            L67:
                r8 = move-exception
                androidx.room.MultiInstanceInvalidationService r9 = r7.f3649a     // Catch: java.lang.Throwable -> L79
                android.os.RemoteCallbackList<k1.q> r9 = r9.f3646a0     // Catch: java.lang.Throwable -> L79
                r9.finishBroadcast()     // Catch: java.lang.Throwable -> L79
                throw r8     // Catch: java.lang.Throwable -> L79
            L70:
                androidx.room.MultiInstanceInvalidationService r8 = r7.f3649a     // Catch: java.lang.Throwable -> L79
                android.os.RemoteCallbackList<k1.q> r8 = r8.f3646a0     // Catch: java.lang.Throwable -> L79
                r8.finishBroadcast()     // Catch: java.lang.Throwable -> L79
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                return
            L79:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                throw r8
        }

        /* renamed from: x */
        public int m2142x(p179k1.InterfaceC3659q r6, java.lang.String r7) {
                r5 = this;
                r0 = 0
                if (r7 != 0) goto L4
                return r0
            L4:
                androidx.room.MultiInstanceInvalidationService r1 = r5.f3649a
                android.os.RemoteCallbackList<k1.q> r1 = r1.f3646a0
                monitor-enter(r1)
                androidx.room.MultiInstanceInvalidationService r2 = r5.f3649a     // Catch: java.lang.Throwable -> L34
                int r3 = r2.f3644Y     // Catch: java.lang.Throwable -> L34
                int r3 = r3 + 1
                r2.f3644Y = r3     // Catch: java.lang.Throwable -> L34
                android.os.RemoteCallbackList<k1.q> r2 = r2.f3646a0     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                boolean r6 = r2.register(r6, r4)     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L2a
                androidx.room.MultiInstanceInvalidationService r6 = r5.f3649a     // Catch: java.lang.Throwable -> L34
                java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r6.f3645Z     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                r6.put(r0, r7)     // Catch: java.lang.Throwable -> L34
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                return r3
            L2a:
                androidx.room.MultiInstanceInvalidationService r6 = r5.f3649a     // Catch: java.lang.Throwable -> L34
                int r7 = r6.f3644Y     // Catch: java.lang.Throwable -> L34
                int r7 = r7 + (-1)
                r6.f3644Y = r7     // Catch: java.lang.Throwable -> L34
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                return r0
            L34:
                r6 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                throw r6
        }
    }

    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3644Y = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3645Z = r0
            androidx.room.MultiInstanceInvalidationService$a r0 = new androidx.room.MultiInstanceInvalidationService$a
            r0.<init>(r1)
            r1.f3646a0 = r0
            androidx.room.MultiInstanceInvalidationService$b r0 = new androidx.room.MultiInstanceInvalidationService$b
            r0.<init>(r1)
            r1.f3647b0 = r0
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            k1.r r1 = r0.f3647b0
            return r1
    }
}
