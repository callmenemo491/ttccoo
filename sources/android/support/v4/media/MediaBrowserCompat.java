package android.support.v4.media;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f458b = false;

    /* renamed from: a */
    public final android.support.v4.media.MediaBrowserCompat.InterfaceC0127d f459a;

    public static class CustomActionResultReceiver extends p016b.C0652b {
        @Override // p016b.C0652b
        /* renamed from: a */
        public void mo188a(int r1, android.os.Bundle r2) {
                r0 = this;
                return
        }
    }

    public static class ItemReceiver extends p016b.C0652b {
        @Override // p016b.C0652b
        /* renamed from: a */
        public void mo188a(int r3, android.os.Bundle r4) {
                r2 = this;
                if (r4 == 0) goto L6
                android.os.Bundle r4 = android.support.v4.media.session.MediaSessionCompat.m285g(r4)
            L6:
                r0 = 0
                if (r3 != 0) goto L22
                if (r4 == 0) goto L22
                java.lang.String r3 = "media_item"
                boolean r1 = r4.containsKey(r3)
                if (r1 == 0) goto L22
                android.os.Parcelable r3 = r4.getParcelable(r3)
                if (r3 == 0) goto L1f
                boolean r4 = r3 instanceof android.support.v4.media.MediaBrowserCompat.MediaItem
                if (r4 == 0) goto L1e
                goto L1f
            L1e:
                throw r0
            L1f:
                android.support.v4.media.MediaBrowserCompat$MediaItem r3 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r3
                throw r0
            L22:
                throw r0
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat.MediaItem> CREATOR = null;

        /* renamed from: Y */
        public final int f460Y;

        /* renamed from: Z */
        public final android.support.v4.media.MediaDescriptionCompat f461Z;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0123a implements android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat.MediaItem> {
            public C0123a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.MediaBrowserCompat.MediaItem createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaItem r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.MediaBrowserCompat.MediaItem[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaItem[] r1 = new android.support.v4.media.MediaBrowserCompat.MediaItem[r1]
                    return r1
            }
        }

        static {
                android.support.v4.media.MediaBrowserCompat$MediaItem$a r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem$a
                r0.<init>()
                android.support.v4.media.MediaBrowserCompat.MediaItem.CREATOR = r0
                return
        }

        public MediaItem(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.f460Y = r0
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = (android.support.v4.media.MediaDescriptionCompat) r2
                r1.f461Z = r2
                return
        }

        public MediaItem(android.support.v4.media.MediaDescriptionCompat r2, int r3) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L1a
                java.lang.String r0 = r2.f485Y
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L12
                r1.f460Y = r3
                r1.f461Z = r2
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description must have a non-empty media id"
                r2.<init>(r3)
                throw r2
            L1a:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description cannot be null"
                r2.<init>(r3)
                throw r2
        }

        /* renamed from: a */
        public static java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> m189a(java.util.List<?> r5) {
                r0 = 0
                if (r5 == 0) goto L36
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r5.size()
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
            L10:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r5.next()
                if (r2 == 0) goto L30
                android.media.browse.MediaBrowser$MediaItem r2 = (android.media.browse.MediaBrowser.MediaItem) r2
                int r3 = android.support.v4.media.MediaBrowserCompat.C0124a.m191b(r2)
                android.media.MediaDescription r2 = android.support.v4.media.MediaBrowserCompat.C0124a.m190a(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = android.support.v4.media.MediaDescriptionCompat.m207a(r2)
                android.support.v4.media.MediaBrowserCompat$MediaItem r4 = new android.support.v4.media.MediaBrowserCompat$MediaItem
                r4.<init>(r2, r3)
                goto L31
            L30:
                r4 = r0
            L31:
                r1.add(r4)
                goto L10
            L35:
                return r1
            L36:
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "MediaItem{"
                r0.<init>(r1)
                java.lang.String r1 = "mFlags="
                r0.append(r1)
                int r1 = r2.f460Y
                r0.append(r1)
                java.lang.String r1 = ", mDescription="
                r0.append(r1)
                android.support.v4.media.MediaDescriptionCompat r1 = r2.f461Z
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r0 = r1.f460Y
                r2.writeInt(r0)
                android.support.v4.media.MediaDescriptionCompat r0 = r1.f461Z
                java.lang.Object r0 = r0.m208b()
                android.media.MediaDescription r0 = (android.media.MediaDescription) r0
                r0.writeToParcel(r2, r3)
                return
        }
    }

    public static class SearchResultReceiver extends p016b.C0652b {
        @Override // p016b.C0652b
        /* renamed from: a */
        public void mo188a(int r5, android.os.Bundle r6) {
                r4 = this;
                if (r6 == 0) goto L6
                android.os.Bundle r6 = android.support.v4.media.session.MediaSessionCompat.m285g(r6)
            L6:
                r0 = 0
                if (r5 != 0) goto L2e
                if (r6 == 0) goto L2e
                java.lang.String r5 = "search_results"
                boolean r1 = r6.containsKey(r5)
                if (r1 == 0) goto L2e
                android.os.Parcelable[] r5 = r6.getParcelableArray(r5)
                java.util.Objects.requireNonNull(r5)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r1 = r5.length
                r2 = 0
            L21:
                if (r2 >= r1) goto L2d
                r3 = r5[r2]
                android.support.v4.media.MediaBrowserCompat$MediaItem r3 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r3
                r6.add(r3)
                int r2 = r2 + 1
                goto L21
            L2d:
                throw r0
            L2e:
                throw r0
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0124a {
        /* renamed from: a */
        public static android.media.MediaDescription m190a(android.media.browse.MediaBrowser.MediaItem r0) {
                android.media.MediaDescription r0 = r0.getDescription()
                return r0
        }

        /* renamed from: b */
        public static int m191b(android.media.browse.MediaBrowser.MediaItem r0) {
                int r0 = r0.getFlags()
                return r0
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class HandlerC0125b extends android.os.Handler {

        /* renamed from: a */
        public final java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.InterfaceC0131h> f462a;

        /* renamed from: b */
        public java.lang.ref.WeakReference<android.os.Messenger> f463b;

        public HandlerC0125b(android.support.v4.media.MediaBrowserCompat.InterfaceC0131h r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f462a = r0
                return
        }

        /* renamed from: a */
        public void m192a(android.os.Messenger r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f463b = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r12) {
                r11 = this;
                java.lang.String r0 = "MediaBrowserCompat"
                java.lang.ref.WeakReference<android.os.Messenger> r1 = r11.f463b
                if (r1 == 0) goto Lae
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto Lae
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$h> r1 = r11.f462a
                java.lang.Object r1 = r1.get()
                if (r1 != 0) goto L16
                goto Lae
            L16:
                android.os.Bundle r1 = r12.getData()
                android.support.v4.media.session.MediaSessionCompat.m283a(r1)
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$h> r2 = r11.f462a
                java.lang.Object r2 = r2.get()
                android.support.v4.media.MediaBrowserCompat$h r2 = (android.support.v4.media.MediaBrowserCompat.InterfaceC0131h) r2
                java.lang.ref.WeakReference<android.os.Messenger> r3 = r11.f463b
                java.lang.Object r3 = r3.get()
                r9 = r3
                android.os.Messenger r9 = (android.os.Messenger) r9
                r10 = 1
                int r3 = r12.what     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r4 = "data_media_item_id"
                if (r3 == r10) goto L88
                r5 = 2
                if (r3 == r5) goto L84
                r5 = 3
                if (r3 == r5) goto L62
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.BadParcelableException -> La1
                r1.<init>()     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "Unhandled message: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                r1.append(r12)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "\n  Client version: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                r1.append(r10)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "\n  Service version: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                int r3 = r12.arg1     // Catch: android.os.BadParcelableException -> La1
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r1 = r1.toString()     // Catch: android.os.BadParcelableException -> La1
                android.util.Log.w(r0, r1)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L62:
                java.lang.String r3 = "data_options"
                android.os.Bundle r7 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.m283a(r7)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "data_notify_children_changed_options"
                android.os.Bundle r8 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.m283a(r8)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r5 = r1.getString(r4)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "data_media_item_list"
                java.util.ArrayList r6 = r1.getParcelableArrayList(r3)     // Catch: android.os.BadParcelableException -> La1
                r3 = r2
                r4 = r9
                r3.mo200e(r4, r5, r6, r7, r8)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L84:
                r2.mo198b(r9)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L88:
                java.lang.String r3 = "data_root_hints"
                android.os.Bundle r3 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.m283a(r3)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r4 = r1.getString(r4)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r5 = "data_media_session_token"
                android.os.Parcelable r1 = r1.getParcelable(r5)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat$Token r1 = (android.support.v4.media.session.MediaSessionCompat.Token) r1     // Catch: android.os.BadParcelableException -> La1
                r2.mo199c(r9, r4, r1, r3)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            La1:
                java.lang.String r1 = "Could not unparcel the data."
                android.util.Log.e(r0, r1)
                int r12 = r12.what
                if (r12 != r10) goto Lae
                r2.mo198b(r9)
            Lae:
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0126c {

        /* renamed from: a */
        public final android.media.browse.MediaBrowser.ConnectionCallback f464a;

        /* renamed from: b */
        public android.support.v4.media.MediaBrowserCompat.C0126c.b f465b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        public class a extends android.media.browse.MediaBrowser.ConnectionCallback {

            /* renamed from: a */
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.C0126c f466a;

            public a(android.support.v4.media.MediaBrowserCompat.C0126c r1) {
                    r0 = this;
                    r0.f466a = r1
                    r0.<init>()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                    r8 = this;
                    android.support.v4.media.MediaBrowserCompat$c r0 = r8.f466a
                    android.support.v4.media.MediaBrowserCompat$c$b r0 = r0.f465b
                    if (r0 == 0) goto L8f
                    android.support.v4.media.MediaBrowserCompat$e r0 = (android.support.v4.media.MediaBrowserCompat.C0128e) r0
                    java.util.Objects.requireNonNull(r0)
                    java.lang.String r1 = "MediaBrowserCompat"
                    android.media.browse.MediaBrowser r2 = r0.f468b     // Catch: java.lang.IllegalStateException -> L89
                    android.os.Bundle r2 = r2.getExtras()     // Catch: java.lang.IllegalStateException -> L89
                    if (r2 != 0) goto L17
                    goto L8f
                L17:
                    r3 = 0
                    java.lang.String r4 = "extra_service_version"
                    int r3 = r2.getInt(r4, r3)
                    r0.f472f = r3
                    java.lang.String r3 = "extra_messenger"
                    android.os.IBinder r3 = r2.getBinder(r3)
                    if (r3 == 0) goto L70
                    android.support.v4.media.MediaBrowserCompat$i r4 = new android.support.v4.media.MediaBrowserCompat$i
                    android.os.Bundle r5 = r0.f469c
                    r4.<init>(r3, r5)
                    r0.f473g = r4
                    android.os.Messenger r3 = new android.os.Messenger
                    android.support.v4.media.MediaBrowserCompat$b r4 = r0.f470d
                    r3.<init>(r4)
                    r0.f474h = r3
                    android.support.v4.media.MediaBrowserCompat$b r4 = r0.f470d
                    r4.m192a(r3)
                    android.support.v4.media.MediaBrowserCompat$i r3 = r0.f473g     // Catch: android.os.RemoteException -> L6b
                    android.content.Context r4 = r0.f467a     // Catch: android.os.RemoteException -> L6b
                    android.os.Messenger r5 = r0.f474h     // Catch: android.os.RemoteException -> L6b
                    java.util.Objects.requireNonNull(r3)     // Catch: android.os.RemoteException -> L6b
                    android.os.Bundle r6 = new android.os.Bundle     // Catch: android.os.RemoteException -> L6b
                    r6.<init>()     // Catch: android.os.RemoteException -> L6b
                    java.lang.String r4 = r4.getPackageName()     // Catch: android.os.RemoteException -> L6b
                    java.lang.String r7 = "data_package_name"
                    r6.putString(r7, r4)     // Catch: android.os.RemoteException -> L6b
                    int r4 = android.os.Process.myPid()     // Catch: android.os.RemoteException -> L6b
                    java.lang.String r7 = "data_calling_pid"
                    r6.putInt(r7, r4)     // Catch: android.os.RemoteException -> L6b
                    android.os.Bundle r4 = r3.f477b     // Catch: android.os.RemoteException -> L6b
                    java.lang.String r7 = "data_root_hints"
                    r6.putBundle(r7, r4)     // Catch: android.os.RemoteException -> L6b
                    r4 = 6
                    r3.m203c(r4, r6, r5)     // Catch: android.os.RemoteException -> L6b
                    goto L70
                L6b:
                    java.lang.String r3 = "Remote error registering client messenger."
                    android.util.Log.i(r1, r3)
                L70:
                    java.lang.String r1 = "extra_session_binder"
                    android.os.IBinder r1 = r2.getBinder(r1)
                    android.support.v4.media.session.b r1 = android.support.v4.media.session.InterfaceC0175b.a.m426v(r1)
                    if (r1 == 0) goto L8f
                    android.media.browse.MediaBrowser r2 = r0.f468b
                    android.media.session.MediaSession$Token r2 = r2.getSessionToken()
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = android.support.v4.media.session.MediaSessionCompat.Token.m294a(r2, r1)
                    r0.f475i = r1
                    goto L8f
                L89:
                    r0 = move-exception
                    java.lang.String r2 = "Unexpected IllegalStateException"
                    android.util.Log.e(r1, r2, r0)
                L8f:
                    android.support.v4.media.MediaBrowserCompat$c r0 = r8.f466a
                    r0.mo193a()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$c r0 = r1.f466a
                    android.support.v4.media.MediaBrowserCompat$c$b r0 = r0.f465b
                    if (r0 == 0) goto L9
                    java.util.Objects.requireNonNull(r0)
                L9:
                    android.support.v4.media.MediaBrowserCompat$c r0 = r1.f466a
                    r0.mo194b()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                    r2 = this;
                    android.support.v4.media.MediaBrowserCompat$c r0 = r2.f466a
                    android.support.v4.media.MediaBrowserCompat$c$b r0 = r0.f465b
                    if (r0 == 0) goto L14
                    android.support.v4.media.MediaBrowserCompat$e r0 = (android.support.v4.media.MediaBrowserCompat.C0128e) r0
                    r1 = 0
                    r0.f473g = r1
                    r0.f474h = r1
                    r0.f475i = r1
                    android.support.v4.media.MediaBrowserCompat$b r0 = r0.f470d
                    r0.m192a(r1)
                L14:
                    android.support.v4.media.MediaBrowserCompat$c r0 = r2.f466a
                    r0.mo195c()
                    return
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        public interface b {
        }

        public C0126c() {
                r1 = this;
                r1.<init>()
                android.support.v4.media.MediaBrowserCompat$c$a r0 = new android.support.v4.media.MediaBrowserCompat$c$a
                r0.<init>(r1)
                r1.f464a = r0
                return
        }

        /* renamed from: a */
        public void mo193a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: b */
        public void mo194b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: c */
        public void mo195c() {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public interface InterfaceC0127d {
        /* renamed from: a */
        void mo196a(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r3);

        /* renamed from: d */
        void mo197d(java.lang.String r1, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C0128e implements android.support.v4.media.MediaBrowserCompat.InterfaceC0127d, android.support.v4.media.MediaBrowserCompat.InterfaceC0131h, android.support.v4.media.MediaBrowserCompat.C0126c.b {

        /* renamed from: a */
        public final android.content.Context f467a;

        /* renamed from: b */
        public final android.media.browse.MediaBrowser f468b;

        /* renamed from: c */
        public final android.os.Bundle f469c;

        /* renamed from: d */
        public final android.support.v4.media.MediaBrowserCompat.HandlerC0125b f470d;

        /* renamed from: e */
        public final p319s.C5934a<java.lang.String, android.support.v4.media.MediaBrowserCompat.C0133j> f471e;

        /* renamed from: f */
        public int f472f;

        /* renamed from: g */
        public android.support.v4.media.MediaBrowserCompat.C0132i f473g;

        /* renamed from: h */
        public android.os.Messenger f474h;

        /* renamed from: i */
        public android.support.v4.media.session.MediaSessionCompat.Token f475i;

        public C0128e(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.C0126c r5, android.os.Bundle r6) {
                r2 = this;
                r2.<init>()
                android.support.v4.media.MediaBrowserCompat$b r0 = new android.support.v4.media.MediaBrowserCompat$b
                r0.<init>(r2)
                r2.f470d = r0
                s.a r0 = new s.a
                r0.<init>()
                r2.f471e = r0
                r2.f467a = r3
                android.os.Bundle r0 = new android.os.Bundle
                if (r6 == 0) goto L1b
                r0.<init>(r6)
                goto L1e
            L1b:
                r0.<init>()
            L1e:
                r2.f469c = r0
                r6 = 1
                java.lang.String r1 = "extra_client_version"
                r0.putInt(r1, r6)
                int r6 = android.os.Process.myPid()
                java.lang.String r1 = "extra_calling_pid"
                r0.putInt(r1, r6)
                r5.f465b = r2
                android.media.browse.MediaBrowser r6 = new android.media.browse.MediaBrowser
                android.media.browse.MediaBrowser$ConnectionCallback r5 = r5.f464a
                r6.<init>(r3, r4, r5, r0)
                r2.f468b = r6
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0127d
        /* renamed from: a */
        public void mo196a(java.lang.String r4, android.os.Bundle r5, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r6) {
                r3 = this;
                s.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$j> r0 = r3.f471e
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r4, r1)
                android.support.v4.media.MediaBrowserCompat$j r0 = (android.support.v4.media.MediaBrowserCompat.C0133j) r0
                if (r0 != 0) goto L15
                android.support.v4.media.MediaBrowserCompat$j r0 = new android.support.v4.media.MediaBrowserCompat$j
                r0.<init>()
                s.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$j> r2 = r3.f471e
                r2.put(r4, r0)
            L15:
                java.util.Objects.requireNonNull(r6)
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r6.f482c = r2
                if (r5 != 0) goto L22
                goto L27
            L22:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r5)
            L27:
                r0.m205b(r1, r6)
                android.support.v4.media.MediaBrowserCompat$i r5 = r3.f473g
                if (r5 != 0) goto L36
                android.media.browse.MediaBrowser r5 = r3.f468b
                android.media.browse.MediaBrowser$SubscriptionCallback r6 = r6.f480a
                r5.subscribe(r4, r6)
                goto L54
            L36:
                android.os.IBinder r6 = r6.f481b     // Catch: android.os.RemoteException -> L3e
                android.os.Messenger r0 = r3.f474h     // Catch: android.os.RemoteException -> L3e
                r5.m201a(r4, r6, r1, r0)     // Catch: android.os.RemoteException -> L3e
                goto L54
            L3e:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Remote error subscribing media item: "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "MediaBrowserCompat"
                android.util.Log.i(r5, r4)
            L54:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0131h
        /* renamed from: b */
        public void mo198b(android.os.Messenger r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0131h
        /* renamed from: c */
        public void mo199c(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0127d
        /* renamed from: d */
        public void mo197d(java.lang.String r8, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r9) {
                r7 = this;
                s.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$j> r0 = r7.f471e
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r8, r1)
                android.support.v4.media.MediaBrowserCompat$j r0 = (android.support.v4.media.MediaBrowserCompat.C0133j) r0
                if (r0 != 0) goto Lc
                return
            Lc:
                android.support.v4.media.MediaBrowserCompat$i r2 = r7.f473g
                if (r2 != 0) goto L38
                if (r9 != 0) goto L13
                goto L32
            L13:
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r1 = r0.f478a
                java.util.List<android.os.Bundle> r2 = r0.f479b
                int r3 = r1.size()
            L1b:
                int r3 = r3 + (-1)
                if (r3 < 0) goto L2c
                java.lang.Object r4 = r1.get(r3)
                if (r4 != r9) goto L2b
                r1.remove(r3)
                r2.remove(r3)
            L2b:
                goto L1b
            L2c:
                int r1 = r1.size()
                if (r1 != 0) goto L78
            L32:
                android.media.browse.MediaBrowser r1 = r7.f468b
                r1.unsubscribe(r8)
                goto L78
            L38:
                if (r9 != 0) goto L40
                android.os.Messenger r3 = r7.f474h     // Catch: android.os.RemoteException -> L62
                r2.m202b(r8, r1, r3)     // Catch: android.os.RemoteException -> L62
                goto L78
            L40:
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r1 = r0.f478a     // Catch: android.os.RemoteException -> L62
                java.util.List<android.os.Bundle> r2 = r0.f479b     // Catch: android.os.RemoteException -> L62
                int r3 = r1.size()     // Catch: android.os.RemoteException -> L62
            L48:
                int r3 = r3 + (-1)
                if (r3 < 0) goto L78
                java.lang.Object r4 = r1.get(r3)     // Catch: android.os.RemoteException -> L62
                if (r4 != r9) goto L61
                android.support.v4.media.MediaBrowserCompat$i r4 = r7.f473g     // Catch: android.os.RemoteException -> L62
                android.os.IBinder r5 = r9.f481b     // Catch: android.os.RemoteException -> L62
                android.os.Messenger r6 = r7.f474h     // Catch: android.os.RemoteException -> L62
                r4.m202b(r8, r5, r6)     // Catch: android.os.RemoteException -> L62
                r1.remove(r3)     // Catch: android.os.RemoteException -> L62
                r2.remove(r3)     // Catch: android.os.RemoteException -> L62
            L61:
                goto L48
            L62:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "removeSubscription failed with RemoteException parentId="
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.d(r2, r1)
            L78:
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r0 = r0.f478a
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L82
                if (r9 != 0) goto L87
            L82:
                s.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$j> r9 = r7.f471e
                r9.remove(r8)
            L87:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0131h
        /* renamed from: e */
        public void mo200e(android.os.Messenger r1, java.lang.String r2, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r3, android.os.Bundle r4, android.os.Bundle r5) {
                r0 = this;
                android.os.Messenger r5 = r0.f474h
                if (r5 == r1) goto L5
                return
            L5:
                s.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$j> r1 = r0.f471e
                r5 = 0
                java.lang.Object r1 = r1.getOrDefault(r2, r5)
                android.support.v4.media.MediaBrowserCompat$j r1 = (android.support.v4.media.MediaBrowserCompat.C0133j) r1
                if (r1 != 0) goto L2b
                boolean r1 = android.support.v4.media.MediaBrowserCompat.f458b
                if (r1 == 0) goto L2a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "onLoadChildren for id that isn't subscribed id="
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.d(r2, r1)
            L2a:
                return
            L2b:
                android.support.v4.media.MediaBrowserCompat$k r1 = r1.m204a(r4)
                if (r1 == 0) goto L39
                if (r4 != 0) goto L39
                if (r3 != 0) goto L36
                goto L39
            L36:
                r1.mo206a(r2, r3)
            L39:
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0129f extends android.support.v4.media.MediaBrowserCompat.C0128e {
        public C0129f(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.C0126c r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C0130g extends android.support.v4.media.MediaBrowserCompat.C0129f {
        public C0130g(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.C0126c r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0128e, android.support.v4.media.MediaBrowserCompat.InterfaceC0127d
        /* renamed from: a */
        public void mo196a(java.lang.String r2, android.os.Bundle r3, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r4) {
                r1 = this;
                android.support.v4.media.MediaBrowserCompat$i r3 = r1.f473g
                if (r3 == 0) goto Lf
                int r3 = r1.f472f
                r0 = 2
                if (r3 >= r0) goto La
                goto Lf
            La:
                r3 = 0
                super.mo196a(r2, r3, r4)
                goto L16
            Lf:
                android.media.browse.MediaBrowser r3 = r1.f468b
                android.media.browse.MediaBrowser$SubscriptionCallback r4 = r4.f480a
                r3.subscribe(r2, r4)
            L16:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0128e, android.support.v4.media.MediaBrowserCompat.InterfaceC0127d
        /* renamed from: d */
        public void mo197d(java.lang.String r3, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r4) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$i r0 = r2.f473g
                if (r0 == 0) goto Le
                int r0 = r2.f472f
                r1 = 2
                if (r0 >= r1) goto La
                goto Le
            La:
                super.mo197d(r3, r4)
                goto L15
            Le:
                android.media.browse.MediaBrowser r0 = r2.f468b
                android.media.browse.MediaBrowser$SubscriptionCallback r4 = r4.f480a
                r0.unsubscribe(r3, r4)
            L15:
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public interface InterfaceC0131h {
        /* renamed from: b */
        void mo198b(android.os.Messenger r1);

        /* renamed from: c */
        void mo199c(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4);

        /* renamed from: e */
        void mo200e(android.os.Messenger r1, java.lang.String r2, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r3, android.os.Bundle r4, android.os.Bundle r5);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0132i {

        /* renamed from: a */
        public android.os.Messenger f476a;

        /* renamed from: b */
        public android.os.Bundle f477b;

        public C0132i(android.os.IBinder r2, android.os.Bundle r3) {
                r1 = this;
                r1.<init>()
                android.os.Messenger r0 = new android.os.Messenger
                r0.<init>(r2)
                r1.f476a = r0
                r1.f477b = r3
                return
        }

        /* renamed from: a */
        public void m201a(java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5, android.os.Messenger r6) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                r0.putBinder(r3, r4)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                r3 = 3
                r2.m203c(r3, r0, r6)
                return
        }

        /* renamed from: b */
        public void m202b(java.lang.String r3, android.os.IBinder r4, android.os.Messenger r5) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                r0.putBinder(r3, r4)
                r3 = 4
                r2.m203c(r3, r0, r5)
                return
        }

        /* renamed from: c */
        public final void m203c(int r2, android.os.Bundle r3, android.os.Messenger r4) {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 1
                r0.arg1 = r2
                r0.setData(r3)
                r0.replyTo = r4
                android.os.Messenger r2 = r1.f476a
                r2.send(r0)
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static class C0133j {

        /* renamed from: a */
        public final java.util.List<android.support.v4.media.MediaBrowserCompat.AbstractC0134k> f478a;

        /* renamed from: b */
        public final java.util.List<android.os.Bundle> f479b;

        public C0133j() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f478a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f479b = r0
                return
        }

        /* renamed from: a */
        public android.support.v4.media.MediaBrowserCompat.AbstractC0134k m204a(android.os.Bundle r3) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.f479b
                int r1 = r1.size()
                if (r0 >= r1) goto L23
                java.util.List<android.os.Bundle> r1 = r2.f479b
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = p064e.C1492f.m4041a(r1, r3)
                if (r1 == 0) goto L20
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r3 = r2.f478a
                java.lang.Object r3 = r3.get(r0)
                android.support.v4.media.MediaBrowserCompat$k r3 = (android.support.v4.media.MediaBrowserCompat.AbstractC0134k) r3
                return r3
            L20:
                int r0 = r0 + 1
                goto L1
            L23:
                r3 = 0
                return r3
        }

        /* renamed from: b */
        public void m205b(android.os.Bundle r3, android.support.v4.media.MediaBrowserCompat.AbstractC0134k r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.f479b
                int r1 = r1.size()
                if (r0 >= r1) goto L20
                java.util.List<android.os.Bundle> r1 = r2.f479b
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = p064e.C1492f.m4041a(r1, r3)
                if (r1 == 0) goto L1d
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r3 = r2.f478a
                r3.set(r0, r4)
                return
            L1d:
                int r0 = r0 + 1
                goto L1
            L20:
                java.util.List<android.support.v4.media.MediaBrowserCompat$k> r0 = r2.f478a
                r0.add(r4)
                java.util.List<android.os.Bundle> r4 = r2.f479b
                r4.add(r3)
                return
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class AbstractC0134k {

        /* renamed from: a */
        public final android.media.browse.MediaBrowser.SubscriptionCallback f480a;

        /* renamed from: b */
        public final android.os.IBinder f481b;

        /* renamed from: c */
        public java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.C0133j> f482c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        public class a extends android.media.browse.MediaBrowser.SubscriptionCallback {

            /* renamed from: a */
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.AbstractC0134k f483a;

            public a(android.support.v4.media.MediaBrowserCompat.AbstractC0134k r1) {
                    r0 = this;
                    r0.f483a = r1
                    r0.<init>()
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(java.lang.String r9, java.util.List<android.media.browse.MediaBrowser.MediaItem> r10) {
                    r8 = this;
                    android.support.v4.media.MediaBrowserCompat$k r0 = r8.f483a
                    java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$j> r0 = r0.f482c
                    if (r0 != 0) goto L8
                    r0 = 0
                    goto Le
                L8:
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.MediaBrowserCompat$j r0 = (android.support.v4.media.MediaBrowserCompat.C0133j) r0
                Le:
                    if (r0 != 0) goto L1a
                    android.support.v4.media.MediaBrowserCompat$k r0 = r8.f483a
                    java.util.List r10 = android.support.v4.media.MediaBrowserCompat.MediaItem.m189a(r10)
                    r0.mo206a(r9, r10)
                    goto L75
                L1a:
                    java.util.List r10 = android.support.v4.media.MediaBrowserCompat.MediaItem.m189a(r10)
                    java.util.List<android.support.v4.media.MediaBrowserCompat$k> r1 = r0.f478a
                    java.util.List<android.os.Bundle> r0 = r0.f479b
                    r2 = 0
                L23:
                    int r3 = r1.size()
                    if (r2 >= r3) goto L75
                    java.lang.Object r3 = r0.get(r2)
                    android.os.Bundle r3 = (android.os.Bundle) r3
                    if (r3 != 0) goto L37
                    android.support.v4.media.MediaBrowserCompat$k r3 = r8.f483a
                    r3.mo206a(r9, r10)
                    goto L72
                L37:
                    android.support.v4.media.MediaBrowserCompat$k r4 = r8.f483a
                    if (r10 != 0) goto L3c
                    goto L6f
                L3c:
                    r5 = -1
                    java.lang.String r6 = "android.media.browse.extra.PAGE"
                    int r6 = r3.getInt(r6, r5)
                    java.lang.String r7 = "android.media.browse.extra.PAGE_SIZE"
                    int r3 = r3.getInt(r7, r5)
                    if (r6 != r5) goto L4e
                    if (r3 != r5) goto L4e
                    goto L6f
                L4e:
                    int r5 = r3 * r6
                    int r7 = r5 + r3
                    if (r6 < 0) goto L6c
                    r6 = 1
                    if (r3 < r6) goto L6c
                    int r3 = r10.size()
                    if (r5 < r3) goto L5e
                    goto L6c
                L5e:
                    int r3 = r10.size()
                    if (r7 <= r3) goto L68
                    int r7 = r10.size()
                L68:
                    r10.subList(r5, r7)
                    goto L6f
                L6c:
                    java.util.Collections.emptyList()
                L6f:
                    java.util.Objects.requireNonNull(r4)
                L72:
                    int r2 = r2 + 1
                    goto L23
                L75:
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(java.lang.String r1) {
                    r0 = this;
                    android.support.v4.media.MediaBrowserCompat$k r1 = r0.f483a
                    java.util.Objects.requireNonNull(r1)
                    return
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        public class b extends android.support.v4.media.MediaBrowserCompat.AbstractC0134k.a {

            /* renamed from: b */
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.AbstractC0134k f484b;

            public b(android.support.v4.media.MediaBrowserCompat.AbstractC0134k r1) {
                    r0 = this;
                    r0.f484b = r1
                    r0.<init>(r1)
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(java.lang.String r1, java.util.List<android.media.browse.MediaBrowser.MediaItem> r2, android.os.Bundle r3) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r3)
                    android.support.v4.media.MediaBrowserCompat$k r1 = r0.f484b
                    android.support.v4.media.MediaBrowserCompat.MediaItem.m189a(r2)
                    java.util.Objects.requireNonNull(r1)
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat.m283a(r2)
                    android.support.v4.media.MediaBrowserCompat$k r1 = r0.f484b
                    java.util.Objects.requireNonNull(r1)
                    return
            }
        }

        public AbstractC0134k() {
                r2 = this;
                r2.<init>()
                android.os.Binder r0 = new android.os.Binder
                r0.<init>()
                r2.f481b = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L16
                android.support.v4.media.MediaBrowserCompat$k$b r0 = new android.support.v4.media.MediaBrowserCompat$k$b
                r0.<init>(r2)
                goto L1b
            L16:
                android.support.v4.media.MediaBrowserCompat$k$a r0 = new android.support.v4.media.MediaBrowserCompat$k$a
                r0.<init>(r2)
            L1b:
                r2.f480a = r0
                return
        }

        /* renamed from: a */
        public void mo206a(java.lang.String r1, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2) {
                r0 = this;
                return
        }
    }

    static {
            java.lang.String r0 = "MediaBrowserCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            android.support.v4.media.MediaBrowserCompat.f458b = r0
            return
    }

    public MediaBrowserCompat(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.C0126c r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 26
            if (r6 < r1) goto L10
            android.support.v4.media.MediaBrowserCompat$g r6 = new android.support.v4.media.MediaBrowserCompat$g
            r6.<init>(r3, r4, r5, r0)
            goto L1f
        L10:
            r1 = 23
            if (r6 < r1) goto L1a
            android.support.v4.media.MediaBrowserCompat$f r6 = new android.support.v4.media.MediaBrowserCompat$f
            r6.<init>(r3, r4, r5, r0)
            goto L1f
        L1a:
            android.support.v4.media.MediaBrowserCompat$e r6 = new android.support.v4.media.MediaBrowserCompat$e
            r6.<init>(r3, r4, r5, r0)
        L1f:
            r2.f459a = r6
            return
    }

    /* renamed from: a */
    public android.support.v4.media.session.MediaSessionCompat.Token m187a() {
            r3 = this;
            android.support.v4.media.MediaBrowserCompat$d r0 = r3.f459a
            android.support.v4.media.MediaBrowserCompat$e r0 = (android.support.v4.media.MediaBrowserCompat.C0128e) r0
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r0.f475i
            if (r1 != 0) goto L15
            android.media.browse.MediaBrowser r1 = r0.f468b
            android.media.session.MediaSession$Token r1 = r1.getSessionToken()
            r2 = 0
            android.support.v4.media.session.MediaSessionCompat$Token r1 = android.support.v4.media.session.MediaSessionCompat.Token.m294a(r1, r2)
            r0.f475i = r1
        L15:
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.f475i
            return r0
    }
}
