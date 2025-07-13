package android.support.v4.media.session;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final android.support.v4.media.session.MediaControllerCompat.InterfaceC0149b f505a;

    /* renamed from: b */
    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    public final java.util.concurrent.ConcurrentHashMap<android.support.v4.media.session.MediaControllerCompat.AbstractC0148a, java.lang.Boolean> f506b;

    public static class MediaControllerImplApi21 implements android.support.v4.media.session.MediaControllerCompat.InterfaceC0149b {

        /* renamed from: a */
        public final android.media.session.MediaController f507a;

        /* renamed from: b */
        public final java.lang.Object f508b;

        /* renamed from: c */
        public final java.util.List<android.support.v4.media.session.MediaControllerCompat.AbstractC0148a> f509c;

        /* renamed from: d */
        public java.util.HashMap<android.support.v4.media.session.MediaControllerCompat.AbstractC0148a, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.BinderC0147a> f510d;

        /* renamed from: e */
        public final android.support.v4.media.session.MediaSessionCompat.Token f511e;

        public static class ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {

            /* renamed from: Y */
            public java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21> f512Y;

            public ExtraBinderRequestResultReceiver(android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.f512Y = r0
                    return
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int r5, android.os.Bundle r6) {
                    r4 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21> r5 = r4.f512Y
                    java.lang.Object r5 = r5.get()
                    android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r5 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r5
                    if (r5 == 0) goto L64
                    if (r6 != 0) goto Ld
                    goto L64
                Ld:
                    java.lang.Object r0 = r5.f508b
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f511e     // Catch: java.lang.Throwable -> L61
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    android.os.IBinder r2 = r6.getBinder(r2)     // Catch: java.lang.Throwable -> L61
                    android.support.v4.media.session.b r2 = android.support.v4.media.session.InterfaceC0175b.a.m426v(r2)     // Catch: java.lang.Throwable -> L61
                    java.lang.Object r3 = r1.f530Y     // Catch: java.lang.Throwable -> L61
                    monitor-enter(r3)     // Catch: java.lang.Throwable -> L61
                    r1.f532a0 = r2     // Catch: java.lang.Throwable -> L5e
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f511e     // Catch: java.lang.Throwable -> L61
                    java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                    r3 = 0
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    if (r6 != 0) goto L30
                    goto L50
                L30:
                    java.lang.Class<v1.b> r2 = p367v1.C6488b.class
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    r6.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    java.lang.String r2 = "a"
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    boolean r2 = r6 instanceof androidx.versionedparcelable.ParcelImpl     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    if (r2 == 0) goto L48
                    androidx.versionedparcelable.ParcelImpl r6 = (androidx.versionedparcelable.ParcelImpl) r6     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    v1.e r3 = r6.f3732Y     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    goto L50
                L48:
                    java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    java.lang.String r2 = "Invalid parcel"
                    r6.<init>(r2)     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                    throw r6     // Catch: java.lang.RuntimeException -> L50 java.lang.Throwable -> L61
                L50:
                    java.lang.Object r6 = r1.f530Y     // Catch: java.lang.Throwable -> L61
                    monitor-enter(r6)     // Catch: java.lang.Throwable -> L61
                    r1.f533b0 = r3     // Catch: java.lang.Throwable -> L5b
                    monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
                    r5.m264a()     // Catch: java.lang.Throwable -> L61
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
                    return
                L5b:
                    r5 = move-exception
                    monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
                    throw r5     // Catch: java.lang.Throwable -> L61
                L5e:
                    r5 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
                    throw r5     // Catch: java.lang.Throwable -> L61
                L61:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
                    throw r5
                L64:
                    return
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC0147a extends android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c {
            public BinderC0147a(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: M */
            public void mo266M(java.lang.CharSequence r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: S0 */
            public void mo267S0(android.os.Bundle r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Z */
            public void mo268Z() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: b0 */
            public void mo269b0(android.support.v4.media.MediaMetadataCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: c1 */
            public void mo270c1(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: i2 */
            public void mo271i2(android.support.v4.media.session.ParcelableVolumeInfo r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }
        }

        public MediaControllerImplApi21(android.content.Context r3, android.support.v4.media.session.MediaSessionCompat.Token r4) {
                r2 = this;
                r2.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r2.f508b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f509c = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.f510d = r0
                r2.f511e = r4
                android.media.session.MediaController r0 = new android.media.session.MediaController
                java.lang.Object r1 = r4.f531Z
                android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
                r0.<init>(r3, r1)
                r2.f507a = r0
                android.support.v4.media.session.b r3 = r4.m295b()
                if (r3 != 0) goto L36
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r3 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                r3.<init>(r2)
                r4 = 0
                java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                r0.sendCommand(r1, r4, r3)
            L36:
                return
        }

        /* renamed from: a */
        public void m264a() {
                r4 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r4.f511e
                android.support.v4.media.session.b r0 = r0.m295b()
                if (r0 != 0) goto L9
                return
            L9:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$a> r0 = r4.f509c
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r0.next()
                android.support.v4.media.session.MediaControllerCompat$a r1 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r1
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a r2 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a
                r2.<init>(r1)
                java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$a, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a> r3 = r4.f510d
                r3.put(r1, r2)
                r1.f515c = r2
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r4.f511e     // Catch: android.os.RemoteException -> L37
                android.support.v4.media.session.b r3 = r3.m295b()     // Catch: android.os.RemoteException -> L37
                r3.mo365W(r2)     // Catch: android.os.RemoteException -> L37
                r2 = 13
                r3 = 0
                r1.m277f(r2, r3, r3)
                goto Lf
            L37:
                r0 = move-exception
                java.lang.String r1 = "MediaControllerCompat"
                java.lang.String r2 = "Dead object in registerCallback."
                android.util.Log.e(r1, r2, r0)
            L3f:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$a> r0 = r4.f509c
                r0.clear()
                return
        }

        /* renamed from: b */
        public final void m265b(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r4) {
                r3 = this;
                android.media.session.MediaController r0 = r3.f507a
                android.media.session.MediaController$Callback r1 = r4.f513a
                r0.unregisterCallback(r1)
                java.lang.Object r0 = r3.f508b
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r3.f511e     // Catch: java.lang.Throwable -> L39
                android.support.v4.media.session.b r1 = r1.m295b()     // Catch: java.lang.Throwable -> L39
                if (r1 == 0) goto L32
                java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$a, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a> r1 = r3.f510d     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                java.lang.Object r1 = r1.remove(r4)     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.BinderC0147a) r1     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                if (r1 == 0) goto L37
                r2 = 0
                r4.f515c = r2     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                android.support.v4.media.session.MediaSessionCompat$Token r4 = r3.f511e     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                android.support.v4.media.session.b r4 = r4.m295b()     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                r4.mo385n1(r1)     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L39
                goto L37
            L29:
                r4 = move-exception
                java.lang.String r1 = "MediaControllerCompat"
                java.lang.String r2 = "Dead object in unregisterCallback."
                android.util.Log.e(r1, r2, r4)     // Catch: java.lang.Throwable -> L39
                goto L37
            L32:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$a> r1 = r3.f509c     // Catch: java.lang.Throwable -> L39
                r1.remove(r4)     // Catch: java.lang.Throwable -> L39
            L37:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                return
            L39:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                throw r4
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0148a implements android.os.IBinder.DeathRecipient {

        /* renamed from: a */
        public final android.media.session.MediaController.Callback f513a;

        /* renamed from: b */
        public android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.b f514b;

        /* renamed from: c */
        public android.support.v4.media.session.InterfaceC0174a f515c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public static class a extends android.media.session.MediaController.Callback {

            /* renamed from: a */
            public final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.AbstractC0148a> f516a;

            public a(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.f516a = r0
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r1.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L1b
                    r2.getPlaybackType()
                    r2.getAudioAttributes()
                    androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
                    r2.getVolumeControl()
                    r2.getMaxVolume()
                    r2.getCurrentVolume()
                L1b:
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(android.os.Bundle r1) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r1)
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r1 = r0.f516a
                    java.lang.Object r1 = r1.get()
                    android.support.v4.media.session.MediaControllerCompat$a r1 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r1
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(android.media.MediaMetadata r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r1.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L11
                    android.support.v4.media.MediaMetadataCompat r2 = android.support.v4.media.MediaMetadataCompat.m227a(r2)
                    r0.mo272a(r2)
                L11:
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(android.media.session.PlaybackState r3) {
                    r2 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r2.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L16
                    android.support.v4.media.session.a r1 = r0.f515c
                    if (r1 == 0) goto Lf
                    goto L16
                Lf:
                    android.support.v4.media.session.PlaybackStateCompat r3 = android.support.v4.media.session.PlaybackStateCompat.m398a(r3)
                    r0.mo273b(r3)
                L16:
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r1.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L11
                    java.util.List r2 = android.support.v4.media.session.MediaSessionCompat.QueueItem.m290a(r2)
                    r0.mo274c(r2)
                L11:
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(java.lang.CharSequence r1) {
                    r0 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r1 = r0.f516a
                    java.lang.Object r1 = r1.get()
                    android.support.v4.media.session.MediaControllerCompat$a r1 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r1
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r1.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto Ld
                    r0.mo275d()
                Ld:
                    return
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(java.lang.String r4, android.os.Bundle r5) {
                    r3 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r5)
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r3.f516a
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L1b
                    android.support.v4.media.session.a r1 = r0.f515c
                    if (r1 == 0) goto L18
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 23
                    if (r1 >= r2) goto L18
                    goto L1b
                L18:
                    r0.mo276e(r4, r5)
                L1b:
                    return
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public class b extends android.os.Handler {

            /* renamed from: a */
            public boolean f517a;

            /* renamed from: b */
            public final /* synthetic */ android.support.v4.media.session.MediaControllerCompat.AbstractC0148a f518b;

            public b(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r1, android.os.Looper r2) {
                    r0 = this;
                    r0.f518b = r1
                    r0.<init>(r2)
                    r1 = 0
                    r0.f517a = r1
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r3) {
                    r2 = this;
                    boolean r0 = r2.f517a
                    if (r0 != 0) goto L5
                    return
                L5:
                    int r0 = r3.what
                    switch(r0) {
                        case 1: goto L61;
                        case 2: goto L57;
                        case 3: goto L4d;
                        case 4: goto L43;
                        case 5: goto L39;
                        case 6: goto L32;
                        case 7: goto L25;
                        case 8: goto L1f;
                        case 9: goto L15;
                        case 10: goto La;
                        case 11: goto Lb;
                        case 12: goto L15;
                        case 13: goto L2c;
                        default: goto La;
                    }
                La:
                    goto L71
                Lb:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    r3.booleanValue()
                    goto L49
                L15:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    r3.intValue()
                    goto L49
                L1f:
                    android.support.v4.media.session.MediaControllerCompat$a r3 = r2.f518b
                    r3.mo275d()
                    goto L71
                L25:
                    java.lang.Object r3 = r3.obj
                    android.os.Bundle r3 = (android.os.Bundle) r3
                    android.support.v4.media.session.MediaSessionCompat.m283a(r3)
                L2c:
                    android.support.v4.media.session.MediaControllerCompat$a r3 = r2.f518b
                    java.util.Objects.requireNonNull(r3)
                    goto L71
                L32:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    goto L49
                L39:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    java.util.List r3 = (java.util.List) r3
                    r0.mo274c(r3)
                    goto L71
                L43:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.session.MediaControllerCompat$d r3 = (android.support.v4.media.session.MediaControllerCompat.C0151d) r3
                L49:
                    java.util.Objects.requireNonNull(r0)
                    goto L71
                L4d:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
                    r0.mo272a(r3)
                    goto L71
                L57:
                    android.support.v4.media.session.MediaControllerCompat$a r0 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.v4.media.session.PlaybackStateCompat) r3
                    r0.mo273b(r3)
                    goto L71
                L61:
                    android.os.Bundle r0 = r3.getData()
                    android.support.v4.media.session.MediaSessionCompat.m283a(r0)
                    android.support.v4.media.session.MediaControllerCompat$a r1 = r2.f518b
                    java.lang.Object r3 = r3.obj
                    java.lang.String r3 = (java.lang.String) r3
                    r1.mo276e(r3, r0)
                L71:
                    return
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        public static class c extends android.support.v4.media.session.InterfaceC0174a.a {

            /* renamed from: b */
            public final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.AbstractC0148a> f519b;

            public c(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.f519b = r0
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: G */
            public void mo279G(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r2.f519b
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto Le
                    r1 = 1
                    r0.m277f(r1, r3, r4)
                Le:
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Q0 */
            public void mo280Q0(int r4) {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r3.f519b
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L14
                    r1 = 12
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r2 = 0
                    r0.m277f(r1, r4, r2)
                L14:
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Z1 */
            public void mo281Z1(android.support.v4.media.session.PlaybackStateCompat r4) {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r3.f519b
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto Lf
                    r1 = 2
                    r2 = 0
                    r0.m277f(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: u */
            public void mo282u(int r4) {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r0 = r3.f519b
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$a r0 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r0
                    if (r0 == 0) goto L14
                    r1 = 9
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r2 = 0
                    r0.m277f(r1, r4, r2)
                L14:
                    return
            }
        }

        public AbstractC0148a() {
                r1 = this;
                r1.<init>()
                android.support.v4.media.session.MediaControllerCompat$a$a r0 = new android.support.v4.media.session.MediaControllerCompat$a$a
                r0.<init>(r1)
                r1.f513a = r0
                return
        }

        /* renamed from: a */
        public void mo272a(android.support.v4.media.MediaMetadataCompat r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo273b(android.support.v4.media.session.PlaybackStateCompat r1) {
                r0 = this;
                return
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                r0 = 8
                r1 = 0
                r2.m277f(r0, r1, r1)
                return
        }

        /* renamed from: c */
        public void mo274c(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public void mo275d() {
                r0 = this;
                return
        }

        /* renamed from: e */
        public void mo276e(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: f */
        public void m277f(int r2, java.lang.Object r3, android.os.Bundle r4) {
                r1 = this;
                android.support.v4.media.session.MediaControllerCompat$a$b r0 = r1.f514b
                if (r0 == 0) goto Le
                android.os.Message r2 = r0.obtainMessage(r2, r3)
                r2.setData(r4)
                r2.sendToTarget()
            Le:
                return
        }

        /* renamed from: g */
        public void m278g(android.os.Handler r2) {
                r1 = this;
                if (r2 != 0) goto L10
                android.support.v4.media.session.MediaControllerCompat$a$b r2 = r1.f514b
                if (r2 == 0) goto L1e
                r0 = 0
                r2.f517a = r0
                r0 = 0
                r2.removeCallbacksAndMessages(r0)
                r1.f514b = r0
                goto L1e
            L10:
                android.support.v4.media.session.MediaControllerCompat$a$b r0 = new android.support.v4.media.session.MediaControllerCompat$a$b
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r1, r2)
                r1.f514b = r0
                r2 = 1
                r0.f517a = r2
            L1e:
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface InterfaceC0149b {
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static class C0150c extends android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 {
        public C0150c(android.content.Context r1, android.support.v4.media.session.MediaSessionCompat.Token r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static final class C0151d {
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static abstract class AbstractC0152e {
        public AbstractC0152e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static class C0153f extends android.support.v4.media.session.MediaControllerCompat.AbstractC0152e {

        /* renamed from: a */
        public final android.media.session.MediaController.TransportControls f520a;

        public C0153f(android.media.session.MediaController.TransportControls r1) {
                r0 = this;
                r0.<init>()
                r0.f520a = r1
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    public static class C0154g extends android.support.v4.media.session.MediaControllerCompat.C0153f {
        public C0154g(android.media.session.MediaController.TransportControls r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    public static class C0155h extends android.support.v4.media.session.MediaControllerCompat.C0154g {
        public C0155h(android.media.session.MediaController.TransportControls r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    public static class C0156i extends android.support.v4.media.session.MediaControllerCompat.C0155h {
        public C0156i(android.media.session.MediaController.TransportControls r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public MediaControllerCompat(android.content.Context r2, android.support.v4.media.session.MediaSessionCompat.Token r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f506b = r0
            if (r3 == 0) goto L14
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
            r0.<init>(r2, r3)
            r1.f505a = r0
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "sessionToken must not be null"
            r2.<init>(r3)
            throw r2
    }

    public MediaControllerCompat(android.content.Context r3, android.support.v4.media.session.MediaSessionCompat r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f506b = r0
            android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.m286b()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1a
            android.support.v4.media.session.MediaControllerCompat$c r0 = new android.support.v4.media.session.MediaControllerCompat$c
            r0.<init>(r3, r4)
            goto L1f
        L1a:
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
            r0.<init>(r3, r4)
        L1f:
            r2.f505a = r0
            return
    }

    /* renamed from: a */
    public android.support.v4.media.MediaMetadataCompat m259a() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$b r0 = r1.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r0
            android.media.session.MediaController r0 = r0.f507a
            android.media.MediaMetadata r0 = r0.getMetadata()
            if (r0 == 0) goto L11
            android.support.v4.media.MediaMetadataCompat r0 = android.support.v4.media.MediaMetadataCompat.m227a(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    /* renamed from: b */
    public android.support.v4.media.session.PlaybackStateCompat m260b() {
            r4 = this;
            android.support.v4.media.session.MediaControllerCompat$b r0 = r4.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r0
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r0.f511e
            android.support.v4.media.session.b r1 = r1.m295b()
            if (r1 == 0) goto L1f
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r0.f511e     // Catch: android.os.RemoteException -> L17
            android.support.v4.media.session.b r1 = r1.m295b()     // Catch: android.os.RemoteException -> L17
            android.support.v4.media.session.PlaybackStateCompat r0 = r1.mo384n()     // Catch: android.os.RemoteException -> L17
            goto L2d
        L17:
            r1 = move-exception
            java.lang.String r2 = "MediaControllerCompat"
            java.lang.String r3 = "Dead object in getPlaybackState."
            android.util.Log.e(r2, r3, r1)
        L1f:
            android.media.session.MediaController r0 = r0.f507a
            android.media.session.PlaybackState r0 = r0.getPlaybackState()
            if (r0 == 0) goto L2c
            android.support.v4.media.session.PlaybackStateCompat r0 = android.support.v4.media.session.PlaybackStateCompat.m398a(r0)
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    /* renamed from: c */
    public android.support.v4.media.session.MediaControllerCompat.AbstractC0152e m261c() {
            r3 = this;
            android.support.v4.media.session.MediaControllerCompat$b r0 = r3.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r0
            android.media.session.MediaController r0 = r0.f507a
            android.media.session.MediaController$TransportControls r0 = r0.getTransportControls()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L16
            android.support.v4.media.session.MediaControllerCompat$i r1 = new android.support.v4.media.session.MediaControllerCompat$i
            r1.<init>(r0)
            goto L2f
        L16:
            r2 = 24
            if (r1 < r2) goto L20
            android.support.v4.media.session.MediaControllerCompat$h r1 = new android.support.v4.media.session.MediaControllerCompat$h
            r1.<init>(r0)
            goto L2f
        L20:
            r2 = 23
            if (r1 < r2) goto L2a
            android.support.v4.media.session.MediaControllerCompat$g r1 = new android.support.v4.media.session.MediaControllerCompat$g
            r1.<init>(r0)
            goto L2f
        L2a:
            android.support.v4.media.session.MediaControllerCompat$f r1 = new android.support.v4.media.session.MediaControllerCompat$f
            r1.<init>(r0)
        L2f:
            return r1
    }

    /* renamed from: d */
    public void m262d(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r6) {
            r5 = this;
            if (r6 == 0) goto L63
            java.util.concurrent.ConcurrentHashMap<android.support.v4.media.session.MediaControllerCompat$a, java.lang.Boolean> r0 = r5.f506b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.putIfAbsent(r6, r1)
            if (r0 == 0) goto L14
            java.lang.String r6 = "MediaControllerCompat"
            java.lang.String r0 = "the callback has already been registered"
            android.util.Log.w(r6, r0)
            goto L5f
        L14:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r6.m278g(r0)
            android.support.v4.media.session.MediaControllerCompat$b r1 = r5.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r1
            android.media.session.MediaController r2 = r1.f507a
            android.media.session.MediaController$Callback r3 = r6.f513a
            r2.registerCallback(r3, r0)
            java.lang.Object r0 = r1.f508b
            monitor-enter(r0)
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r1.f511e     // Catch: java.lang.Throwable -> L60
            android.support.v4.media.session.b r2 = r2.m295b()     // Catch: java.lang.Throwable -> L60
            r3 = 0
            if (r2 == 0) goto L57
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a r2 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a     // Catch: java.lang.Throwable -> L60
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L60
            java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$a, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a> r4 = r1.f510d     // Catch: java.lang.Throwable -> L60
            r4.put(r6, r2)     // Catch: java.lang.Throwable -> L60
            r6.f515c = r2     // Catch: java.lang.Throwable -> L60
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r1.f511e     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L60
            android.support.v4.media.session.b r1 = r1.m295b()     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L60
            r1.mo365W(r2)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L60
            r1 = 13
            r6.m277f(r1, r3, r3)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L60
            goto L5e
        L4e:
            r6 = move-exception
            java.lang.String r1 = "MediaControllerCompat"
            java.lang.String r2 = "Dead object in registerCallback."
            android.util.Log.e(r1, r2, r6)     // Catch: java.lang.Throwable -> L60
            goto L5e
        L57:
            r6.f515c = r3     // Catch: java.lang.Throwable -> L60
            java.util.List<android.support.v4.media.session.MediaControllerCompat$a> r1 = r1.f509c     // Catch: java.lang.Throwable -> L60
            r1.add(r6)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
        L5f:
            return
        L60:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r6
        L63:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: e */
    public void m263e(android.support.v4.media.session.MediaControllerCompat.AbstractC0148a r3) {
            r2 = this;
            if (r3 == 0) goto L23
            java.util.concurrent.ConcurrentHashMap<android.support.v4.media.session.MediaControllerCompat$a, java.lang.Boolean> r0 = r2.f506b
            java.lang.Object r0 = r0.remove(r3)
            if (r0 != 0) goto L12
            java.lang.String r3 = "MediaControllerCompat"
            java.lang.String r0 = "the callback has never been registered"
            android.util.Log.w(r3, r0)
            return
        L12:
            r0 = 0
            android.support.v4.media.session.MediaControllerCompat$b r1 = r2.f505a     // Catch: java.lang.Throwable -> L1e
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r1     // Catch: java.lang.Throwable -> L1e
            r1.m265b(r3)     // Catch: java.lang.Throwable -> L1e
            r3.m278g(r0)
            return
        L1e:
            r1 = move-exception
            r3.m278g(r0)
            throw r1
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r3.<init>(r0)
            throw r3
    }
}
