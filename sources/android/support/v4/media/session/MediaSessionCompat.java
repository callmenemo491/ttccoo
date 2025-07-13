package android.support.v4.media.session;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d */
    public static final int f521d = 0;

    /* renamed from: e */
    public static int f522e;

    /* renamed from: a */
    public final android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b f523a;

    /* renamed from: b */
    public final android.support.v4.media.session.MediaControllerCompat f524b;

    /* renamed from: c */
    public final java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat.InterfaceC0168h> f525c;

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.QueueItem> CREATOR = null;

        /* renamed from: Y */
        public final android.support.v4.media.MediaDescriptionCompat f526Y;

        /* renamed from: Z */
        public final long f527Z;

        /* renamed from: a0 */
        public android.media.session.MediaSession.QueueItem f528a0;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0157a implements android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.QueueItem> {
            public C0157a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.QueueItem createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r0 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.QueueItem[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat$QueueItem[] r1 = new android.support.v4.media.session.MediaSessionCompat.QueueItem[r1]
                    return r1
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        public static class C0158b {
            /* renamed from: a */
            public static android.media.session.MediaSession.QueueItem m291a(android.media.MediaDescription r1, long r2) {
                    android.media.session.MediaSession$QueueItem r0 = new android.media.session.MediaSession$QueueItem
                    r0.<init>(r1, r2)
                    return r0
            }

            /* renamed from: b */
            public static android.media.MediaDescription m292b(android.media.session.MediaSession.QueueItem r0) {
                    android.media.MediaDescription r0 = r0.getDescription()
                    return r0
            }

            /* renamed from: c */
            public static long m293c(android.media.session.MediaSession.QueueItem r2) {
                    long r0 = r2.getQueueId()
                    return r0
            }
        }

        static {
                android.support.v4.media.session.MediaSessionCompat$QueueItem$a r0 = new android.support.v4.media.session.MediaSessionCompat$QueueItem$a
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR = r0
                return
        }

        public QueueItem(android.media.session.MediaSession.QueueItem r4, android.support.v4.media.MediaDescriptionCompat r5, long r6) {
                r3 = this;
                r3.<init>()
                if (r5 == 0) goto L1a
                r0 = -1
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 == 0) goto L12
                r3.f526Y = r5
                r3.f527Z = r6
                r3.f528a0 = r4
                return
            L12:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Id cannot be QueueItem.UNKNOWN_ID"
                r4.<init>(r5)
                throw r4
            L1a:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Description cannot be null"
                r4.<init>(r5)
                throw r4
        }

        public QueueItem(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r3)
                android.support.v4.media.MediaDescriptionCompat r0 = (android.support.v4.media.MediaDescriptionCompat) r0
                r2.f526Y = r0
                long r0 = r3.readLong()
                r2.f527Z = r0
                return
        }

        /* renamed from: a */
        public static java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> m290a(java.util.List<?> r7) {
                r0 = 0
                if (r7 == 0) goto L32
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            Lc:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r7.next()
                if (r2 == 0) goto L2c
                android.media.session.MediaSession$QueueItem r2 = (android.media.session.MediaSession.QueueItem) r2
                android.media.MediaDescription r3 = android.support.v4.media.session.MediaSessionCompat.QueueItem.C0158b.m292b(r2)
                android.support.v4.media.MediaDescriptionCompat r3 = android.support.v4.media.MediaDescriptionCompat.m207a(r3)
                long r4 = android.support.v4.media.session.MediaSessionCompat.QueueItem.C0158b.m293c(r2)
                android.support.v4.media.session.MediaSessionCompat$QueueItem r6 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
                r6.<init>(r2, r3, r4)
                goto L2d
            L2c:
                r6 = r0
            L2d:
                r1.add(r6)
                goto Lc
            L31:
                return r1
            L32:
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "MediaSession.QueueItem {Description="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.support.v4.media.MediaDescriptionCompat r1 = r3.f526Y
                r0.append(r1)
                java.lang.String r1 = ", Id="
                r0.append(r1)
                long r1 = r3.f527Z
                r0.append(r1)
                java.lang.String r1 = " }"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r2.f526Y
                java.lang.Object r0 = r0.m208b()
                android.media.MediaDescription r0 = (android.media.MediaDescription) r0
                r0.writeToParcel(r3, r4)
                long r0 = r2.f527Z
                r3.writeLong(r0)
                return
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper> CREATOR = null;

        /* renamed from: Y */
        public android.os.ResultReceiver f529Y;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0159a implements android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper> {
            public C0159a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r0 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper[] r1 = new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper[r1]
                    return r1
            }
        }

        static {
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a r0 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR = r0
                return
        }

        public ResultReceiverWrapper(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator r0 = android.os.ResultReceiver.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2
                r1.f529Y = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.ResultReceiver r0 = r1.f529Y
                r0.writeToParcel(r2, r3)
                return
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static final class Token implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.Token> CREATOR = null;

        /* renamed from: Y */
        public final java.lang.Object f530Y;

        /* renamed from: Z */
        public final java.lang.Object f531Z;

        /* renamed from: a0 */
        public android.support.v4.media.session.InterfaceC0175b f532a0;

        /* renamed from: b0 */
        public p367v1.InterfaceC6491e f533b0;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0160a implements android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.Token> {
            public C0160a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.Token createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    r0 = 0
                    android.os.Parcelable r3 = r3.readParcelable(r0)
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = new android.support.v4.media.session.MediaSessionCompat$Token
                    r1.<init>(r3, r0, r0)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.Token[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat$Token[] r1 = new android.support.v4.media.session.MediaSessionCompat.Token[r1]
                    return r1
            }
        }

        static {
                android.support.v4.media.session.MediaSessionCompat$Token$a r0 = new android.support.v4.media.session.MediaSessionCompat$Token$a
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.Token.CREATOR = r0
                return
        }

        public Token(java.lang.Object r2, android.support.v4.media.session.InterfaceC0175b r3, p367v1.InterfaceC6491e r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f530Y = r0
                r1.f531Z = r2
                r1.f532a0 = r3
                r1.f533b0 = r4
                return
        }

        /* renamed from: a */
        public static android.support.v4.media.session.MediaSessionCompat.Token m294a(java.lang.Object r2, android.support.v4.media.session.InterfaceC0175b r3) {
                r0 = 0
                if (r2 == 0) goto L15
                boolean r1 = r2 instanceof android.media.session.MediaSession.Token
                if (r1 == 0) goto Ld
                android.support.v4.media.session.MediaSessionCompat$Token r1 = new android.support.v4.media.session.MediaSessionCompat$Token
                r1.<init>(r2, r3, r0)
                return r1
            Ld:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "token is not a valid MediaSession.Token object"
                r2.<init>(r3)
                throw r2
            L15:
                return r0
        }

        /* renamed from: b */
        public android.support.v4.media.session.InterfaceC0175b m295b() {
                r2 = this;
                java.lang.Object r0 = r2.f530Y
                monitor-enter(r0)
                android.support.v4.media.session.b r1 = r2.f532a0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof android.support.v4.media.session.MediaSessionCompat.Token
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                android.support.v4.media.session.MediaSessionCompat$Token r4 = (android.support.v4.media.session.MediaSessionCompat.Token) r4
                java.lang.Object r1 = r3.f531Z
                java.lang.Object r4 = r4.f531Z
                if (r1 != 0) goto L17
                if (r4 != 0) goto L15
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
            L17:
                if (r4 != 0) goto L1a
                return r2
            L1a:
                boolean r4 = r1.equals(r4)
                return r4
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.f531Z
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.Object r0 = r1.f531Z
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                r2.writeParcelable(r0, r3)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class AbstractC0161a {

        /* renamed from: Y */
        public final java.lang.Object f534Y;

        /* renamed from: Z */
        public final android.media.session.MediaSession.Callback f535Z;

        /* renamed from: a0 */
        public boolean f536a0;

        /* renamed from: b0 */
        public java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b> f537b0;

        /* renamed from: c0 */
        public android.support.v4.media.session.MediaSessionCompat.AbstractC0161a.a f538c0;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        public class a extends android.os.Handler {

            /* renamed from: a */
            public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.AbstractC0161a f539a;

            public a(android.support.v4.media.session.MediaSessionCompat.AbstractC0161a r1, android.os.Looper r2) {
                    r0 = this;
                    r0.f539a = r1
                    r0.<init>(r2)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r5) {
                    r4 = this;
                    int r0 = r5.what
                    r1 = 1
                    if (r0 != r1) goto L39
                    android.support.v4.media.session.MediaSessionCompat$a r0 = r4.f539a
                    java.lang.Object r0 = r0.f534Y
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f539a     // Catch: java.lang.Throwable -> L36
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$b> r1 = r1.f537b0     // Catch: java.lang.Throwable -> L36
                    java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L36
                    android.support.v4.media.session.MediaSessionCompat$b r1 = (android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b) r1     // Catch: java.lang.Throwable -> L36
                    android.support.v4.media.session.MediaSessionCompat$a r2 = r4.f539a     // Catch: java.lang.Throwable -> L36
                    android.support.v4.media.session.MediaSessionCompat$a$a r3 = r2.f538c0     // Catch: java.lang.Throwable -> L36
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                    if (r1 == 0) goto L35
                    android.support.v4.media.session.MediaSessionCompat$a r0 = r1.mo339k()
                    if (r2 != r0) goto L35
                    if (r3 != 0) goto L24
                    goto L35
                L24:
                    java.lang.Object r5 = r5.obj
                    c1.q r5 = (p031c1.C0849q) r5
                    r1.mo340l(r5)
                    android.support.v4.media.session.MediaSessionCompat$a r5 = r4.f539a
                    r5.m315i(r1, r3)
                    r5 = 0
                    r1.mo340l(r5)
                    goto L39
                L35:
                    return
                L36:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                    throw r5
                L39:
                    return
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        public class b extends android.media.session.MediaSession.Callback {

            /* renamed from: a */
            public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.AbstractC0161a f540a;

            public b(android.support.v4.media.session.MediaSessionCompat.AbstractC0161a r1) {
                    r0 = this;
                    r0.f540a = r1
                    r0.<init>()
                    return
            }

            /* renamed from: a */
            public final android.support.v4.media.session.MediaSessionCompat.C0163c m326a() {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$a r0 = r4.f540a
                    java.lang.Object r0 = r0.f534Y
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: java.lang.Throwable -> L22
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$b> r1 = r1.f537b0     // Catch: java.lang.Throwable -> L22
                    java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L22
                    android.support.v4.media.session.MediaSessionCompat$c r1 = (android.support.v4.media.session.MediaSessionCompat.C0163c) r1     // Catch: java.lang.Throwable -> L22
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                    if (r1 == 0) goto L20
                    android.support.v4.media.session.MediaSessionCompat$a r0 = r4.f540a
                    java.lang.Object r2 = r1.f543c
                    monitor-enter(r2)
                    android.support.v4.media.session.MediaSessionCompat$a r3 = r1.f552l     // Catch: java.lang.Throwable -> L1d
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                    if (r0 != r3) goto L20
                    goto L21
                L1d:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                    throw r0
                L20:
                    r1 = 0
                L21:
                    return r1
                L22:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                    throw r1
            }

            /* renamed from: b */
            public final void m327b(android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b r4) {
                    r3 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 28
                    if (r0 < r1) goto L7
                    return
                L7:
                    r0 = r4
                    android.support.v4.media.session.MediaSessionCompat$c r0 = (android.support.v4.media.session.MediaSessionCompat.C0163c) r0
                    java.lang.String r0 = r0.m346r()
                    boolean r1 = android.text.TextUtils.isEmpty(r0)
                    if (r1 == 0) goto L16
                    java.lang.String r0 = "android.media.session.MediaController"
                L16:
                    c1.q r1 = new c1.q
                    r2 = -1
                    r1.<init>(r0, r2, r2)
                    r4.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r5.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r7)
                    r5.m327b(r0)
                    r1 = 0
                    java.lang.String r2 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r2 = r6.equals(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r2 == 0) goto L54
                    android.os.Bundle r6 = new android.os.Bundle     // Catch: android.os.BadParcelableException -> Ld4
                    r6.<init>()     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.f542b     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.session.b r2 = r7.m295b()     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r2 != 0) goto L27
                    r2 = r1
                    goto L2b
                L27:
                    android.os.IBinder r2 = r2.asBinder()     // Catch: android.os.BadParcelableException -> Ld4
                L2b:
                    r6.putBinder(r3, r2)     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                    java.lang.Object r3 = r7.f530Y     // Catch: android.os.BadParcelableException -> Ld4
                    monitor-enter(r3)     // Catch: android.os.BadParcelableException -> Ld4
                    v1.e r7 = r7.f533b0     // Catch: java.lang.Throwable -> L51
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
                    if (r7 != 0) goto L39
                    goto L4b
                L39:
                    android.os.Bundle r3 = new android.os.Bundle     // Catch: android.os.BadParcelableException -> Ld4
                    r3.<init>()     // Catch: android.os.BadParcelableException -> Ld4
                    androidx.versionedparcelable.ParcelImpl r4 = new androidx.versionedparcelable.ParcelImpl     // Catch: android.os.BadParcelableException -> Ld4
                    r4.<init>(r7)     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r7 = "a"
                    r3.putParcelable(r7, r4)     // Catch: android.os.BadParcelableException -> Ld4
                    r6.putParcelable(r2, r3)     // Catch: android.os.BadParcelableException -> Ld4
                L4b:
                    r7 = 0
                    r8.send(r7, r6)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                L51:
                    r6 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
                    throw r6     // Catch: android.os.BadParcelableException -> Ld4
                L54:
                    java.lang.String r2 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r2 = r6.equals(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r2 == 0) goto L6b
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r5.f540a     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r8 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    android.os.Parcelable r7 = r7.getParcelable(r8)     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch: android.os.BadParcelableException -> Ld4
                    r6.mo316l(r7)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                L6b:
                    java.lang.String r2 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r2 = r6.equals(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r2 == 0) goto L87
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r5.f540a     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r8 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    android.os.Parcelable r8 = r7.getParcelable(r8)     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    int r7 = r7.getInt(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    r6.mo317m(r8, r7)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                L87:
                    java.lang.String r2 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r2 = r6.equals(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r2 == 0) goto L9d
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r5.f540a     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.String r8 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    android.os.Parcelable r7 = r7.getParcelable(r8)     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch: android.os.BadParcelableException -> Ld4
                    r6.mo301G(r7)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                L9d:
                    java.lang.String r2 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r2 = r6.equals(r2)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r2 == 0) goto Lce
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f548h     // Catch: android.os.BadParcelableException -> Ld4
                    if (r6 == 0) goto Ldb
                    java.lang.String r6 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    r8 = -1
                    int r6 = r7.getInt(r6, r8)     // Catch: android.os.BadParcelableException -> Ld4
                    if (r6 < 0) goto Lc3
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f548h     // Catch: android.os.BadParcelableException -> Ld4
                    int r7 = r7.size()     // Catch: android.os.BadParcelableException -> Ld4
                    if (r6 >= r7) goto Lc3
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f548h     // Catch: android.os.BadParcelableException -> Ld4
                    java.lang.Object r6 = r7.get(r6)     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r6 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r6     // Catch: android.os.BadParcelableException -> Ld4
                    goto Lc4
                Lc3:
                    r6 = r1
                Lc4:
                    if (r6 == 0) goto Ldb
                    android.support.v4.media.session.MediaSessionCompat$a r7 = r5.f540a     // Catch: android.os.BadParcelableException -> Ld4
                    android.support.v4.media.MediaDescriptionCompat r6 = r6.f526Y     // Catch: android.os.BadParcelableException -> Ld4
                    r7.mo301G(r6)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                Lce:
                    android.support.v4.media.session.MediaSessionCompat$a r2 = r5.f540a     // Catch: android.os.BadParcelableException -> Ld4
                    r2.mo318o(r6, r7, r8)     // Catch: android.os.BadParcelableException -> Ld4
                    goto Ldb
                Ld4:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                Ldb:
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(java.lang.String r5, android.os.Bundle r6) {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r4.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)
                    r4.m327b(r0)
                    java.lang.String r1 = "android.support.v4.media.session.action.PLAY_FROM_URI"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    java.lang.String r2 = "android.support.v4.media.session.action.ARGUMENT_URI"
                    java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                    if (r1 == 0) goto L2d
                    android.os.Parcelable r5 = r6.getParcelable(r2)     // Catch: android.os.BadParcelableException -> L105
                    android.net.Uri r5 = (android.net.Uri) r5     // Catch: android.os.BadParcelableException -> L105
                    android.os.Bundle r6 = r6.getBundle(r3)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo296A(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L2d:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto L3c
                    android.support.v4.media.session.MediaSessionCompat$a r5 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r5.mo297B()     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L3c:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto L58
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"
                    java.lang.String r5 = r6.getString(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.os.Bundle r6 = r6.getBundle(r3)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo298C(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L58:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto L74
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_QUERY"
                    java.lang.String r5 = r6.getString(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.os.Bundle r6 = r6.getBundle(r3)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo299D(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L74:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_URI"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto L90
                    android.os.Parcelable r5 = r6.getParcelable(r2)     // Catch: android.os.BadParcelableException -> L105
                    android.net.Uri r5 = (android.net.Uri) r5     // Catch: android.os.BadParcelableException -> L105
                    android.os.Bundle r6 = r6.getBundle(r3)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo300E(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L90:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto La4
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"
                    boolean r5 = r6.getBoolean(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r6.mo304J(r5)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                La4:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_REPEAT_MODE"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto Lb8
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"
                    int r5 = r6.getInt(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r6.mo308V(r5)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                Lb8:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_SHUFFLE_MODE"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto Lcc
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"
                    int r5 = r6.getInt(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r6.mo309W(r5)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                Lcc:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_RATING"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto Le9
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_RATING"
                    android.os.Parcelable r5 = r6.getParcelable(r5)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5     // Catch: android.os.BadParcelableException -> L105
                    android.os.Bundle r6 = r6.getBundle(r3)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat.m283a(r6)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo307P(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                Le9:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"
                    boolean r1 = r5.equals(r1)     // Catch: android.os.BadParcelableException -> L105
                    if (r1 == 0) goto Lff
                    java.lang.String r5 = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"
                    r1 = 1065353216(0x3f800000, float:1.0)
                    float r5 = r6.getFloat(r5, r1)     // Catch: android.os.BadParcelableException -> L105
                    android.support.v4.media.session.MediaSessionCompat$a r6 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r6.mo305K(r5)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                Lff:
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r4.f540a     // Catch: android.os.BadParcelableException -> L105
                    r1.mo319p(r5, r6)     // Catch: android.os.BadParcelableException -> L105
                    goto L10c
                L105:
                    java.lang.String r5 = "MediaSessionCompat"
                    java.lang.String r6 = "Could not unparcel the data."
                    android.util.Log.e(r5, r6)
                L10c:
                    r5 = 0
                    r0.mo340l(r5)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo320q()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(android.content.Intent r5) {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r4.m326a()
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r4.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r2 = r4.f540a
                    boolean r2 = r2.mo321r(r5)
                    r3 = 0
                    r0.mo340l(r3)
                    if (r2 != 0) goto L1d
                    boolean r5 = super.onMediaButtonEvent(r5)
                    if (r5 == 0) goto L1e
                L1d:
                    r1 = 1
                L1e:
                    return r1
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo322s()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo323w()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo324x(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo325z(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(android.net.Uri r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo296A(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo297B()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo298C(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo299D(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(android.net.Uri r3, android.os.Bundle r4) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.support.v4.media.session.MediaSessionCompat.m283a(r4)
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo300E(r3, r4)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo302H()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long r3) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo303I(r3)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float r3) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo305K(r3)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(android.media.Rating r3) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    android.support.v4.media.RatingCompat r3 = android.support.v4.media.RatingCompat.m237a(r3)
                    r1.mo306L(r3)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo310b0()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo311c0()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long r3) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo312d0(r3)
                    r3 = 0
                    r0.mo340l(r3)
                    return
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.m326a()
                    if (r0 != 0) goto L7
                    return
                L7:
                    r2.m327b(r0)
                    android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f540a
                    r1.mo313e0()
                    r1 = 0
                    r0.mo340l(r1)
                    return
            }
        }

        public AbstractC0161a() {
                r2 = this;
                r2.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r2.f534Y = r0
                android.support.v4.media.session.MediaSessionCompat$a$b r0 = new android.support.v4.media.session.MediaSessionCompat$a$b
                r0.<init>(r2)
                r2.f535Z = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                r2.f537b0 = r0
                return
        }

        /* renamed from: A */
        public void mo296A(android.net.Uri r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: B */
        public void mo297B() {
                r0 = this;
                return
        }

        /* renamed from: C */
        public void mo298C(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: D */
        public void mo299D(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: E */
        public void mo300E(android.net.Uri r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: G */
        public void mo301G(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                return
        }

        /* renamed from: H */
        public void mo302H() {
                r0 = this;
                return
        }

        /* renamed from: I */
        public void mo303I(long r1) {
                r0 = this;
                return
        }

        /* renamed from: J */
        public void mo304J(boolean r1) {
                r0 = this;
                return
        }

        /* renamed from: K */
        public void mo305K(float r1) {
                r0 = this;
                return
        }

        /* renamed from: L */
        public void mo306L(android.support.v4.media.RatingCompat r1) {
                r0 = this;
                return
        }

        /* renamed from: P */
        public void mo307P(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: V */
        public void mo308V(int r1) {
                r0 = this;
                return
        }

        /* renamed from: W */
        public void mo309W(int r1) {
                r0 = this;
                return
        }

        /* renamed from: b0 */
        public void mo310b0() {
                r0 = this;
                return
        }

        /* renamed from: c0 */
        public void mo311c0() {
                r0 = this;
                return
        }

        /* renamed from: d0 */
        public void mo312d0(long r1) {
                r0 = this;
                return
        }

        /* renamed from: e0 */
        public void mo313e0() {
                r0 = this;
                return
        }

        /* renamed from: g0 */
        public void m314g0(android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b r4, android.os.Handler r5) {
                r3 = this;
                java.lang.Object r0 = r3.f534Y
                monitor-enter(r0)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L24
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L24
                r3.f537b0 = r1     // Catch: java.lang.Throwable -> L24
                android.support.v4.media.session.MediaSessionCompat$a$a r1 = r3.f538c0     // Catch: java.lang.Throwable -> L24
                r2 = 0
                if (r1 == 0) goto L12
                r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> L24
            L12:
                if (r4 == 0) goto L20
                if (r5 != 0) goto L17
                goto L20
            L17:
                android.support.v4.media.session.MediaSessionCompat$a$a r2 = new android.support.v4.media.session.MediaSessionCompat$a$a     // Catch: java.lang.Throwable -> L24
                android.os.Looper r4 = r5.getLooper()     // Catch: java.lang.Throwable -> L24
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L24
            L20:
                r3.f538c0 = r2     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                return
            L24:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r4
        }

        /* renamed from: i */
        public void m315i(android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b r9, android.os.Handler r10) {
                r8 = this;
                boolean r0 = r8.f536a0
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r8.f536a0 = r0
                r1 = 1
                r10.removeMessages(r1)
                android.support.v4.media.session.PlaybackStateCompat r9 = r9.mo342n()
                r2 = 0
                if (r9 != 0) goto L16
                r4 = r2
                goto L18
            L16:
                long r4 = r9.f568c0
            L18:
                if (r9 == 0) goto L21
                int r9 = r9.f564Y
                r10 = 3
                if (r9 != r10) goto L21
                r9 = 1
                goto L22
            L21:
                r9 = 0
            L22:
                r6 = 516(0x204, double:2.55E-321)
                long r6 = r6 & r4
                int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r10 == 0) goto L2b
                r10 = 1
                goto L2c
            L2b:
                r10 = 0
            L2c:
                r6 = 514(0x202, double:2.54E-321)
                long r4 = r4 & r6
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 == 0) goto L34
                r0 = 1
            L34:
                if (r9 == 0) goto L3c
                if (r0 == 0) goto L3c
                r8.mo322s()
                goto L43
            L3c:
                if (r9 != 0) goto L43
                if (r10 == 0) goto L43
                r8.mo323w()
            L43:
                return
        }

        /* renamed from: l */
        public void mo316l(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                return
        }

        /* renamed from: m */
        public void mo317m(android.support.v4.media.MediaDescriptionCompat r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: o */
        public void mo318o(java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3) {
                r0 = this;
                return
        }

        /* renamed from: p */
        public void mo319p(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: q */
        public void mo320q() {
                r0 = this;
                return
        }

        /* renamed from: r */
        public boolean mo321r(android.content.Intent r8) {
                r7 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 27
                if (r0 < r2) goto L8
                return r1
            L8:
                java.lang.Object r0 = r7.f534Y
                monitor-enter(r0)
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$b> r2 = r7.f537b0     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L7b
                android.support.v4.media.session.MediaSessionCompat$b r2 = (android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b) r2     // Catch: java.lang.Throwable -> L7b
                android.support.v4.media.session.MediaSessionCompat$a$a r3 = r7.f538c0     // Catch: java.lang.Throwable -> L7b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
                if (r2 == 0) goto L7a
                if (r3 != 0) goto L1b
                goto L7a
            L1b:
                java.lang.String r0 = "android.intent.extra.KEY_EVENT"
                android.os.Parcelable r8 = r8.getParcelableExtra(r0)
                android.view.KeyEvent r8 = (android.view.KeyEvent) r8
                if (r8 == 0) goto L7a
                int r0 = r8.getAction()
                if (r0 == 0) goto L2c
                goto L7a
            L2c:
                c1.q r0 = r2.mo343o()
                int r4 = r8.getKeyCode()
                r5 = 79
                if (r4 == r5) goto L40
                r5 = 85
                if (r4 == r5) goto L40
                r7.m315i(r2, r3)
                return r1
            L40:
                int r8 = r8.getRepeatCount()
                r4 = 1
                if (r8 != 0) goto L76
                boolean r8 = r7.f536a0
                if (r8 == 0) goto L67
                r3.removeMessages(r4)
                r7.f536a0 = r1
                android.support.v4.media.session.PlaybackStateCompat r8 = r2.mo342n()
                r0 = 0
                if (r8 != 0) goto L5a
                r2 = r0
                goto L5c
            L5a:
                long r2 = r8.f568c0
            L5c:
                r5 = 32
                long r2 = r2 & r5
                int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r8 == 0) goto L79
                r7.mo310b0()
                goto L79
            L67:
                r7.f536a0 = r4
                android.os.Message r8 = r3.obtainMessage(r4, r0)
                int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
                long r0 = (long) r0
                r3.sendMessageDelayed(r8, r0)
                goto L79
            L76:
                r7.m315i(r2, r3)
            L79:
                return r4
            L7a:
                return r1
            L7b:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
                throw r8
        }

        /* renamed from: s */
        public void mo322s() {
                r0 = this;
                return
        }

        /* renamed from: w */
        public void mo323w() {
                r0 = this;
                return
        }

        /* renamed from: x */
        public void mo324x(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        /* renamed from: z */
        public void mo325z(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public interface InterfaceC0162b {
        /* renamed from: F */
        void mo328F(int r1);

        /* renamed from: a */
        void mo329a(int r1);

        /* renamed from: b */
        void mo330b(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1);

        /* renamed from: c */
        void mo331c(java.lang.String r1, android.os.Bundle r2);

        /* renamed from: d */
        void mo332d(boolean r1);

        /* renamed from: e */
        android.support.v4.media.session.MediaSessionCompat.Token mo333e();

        /* renamed from: f */
        void mo334f(android.app.PendingIntent r1);

        /* renamed from: g */
        void mo335g(android.support.v4.media.session.PlaybackStateCompat r1);

        /* renamed from: h */
        void mo336h(android.support.v4.media.session.MediaSessionCompat.AbstractC0161a r1, android.os.Handler r2);

        /* renamed from: i */
        void mo337i(p031c1.AbstractC0852t r1);

        /* renamed from: j */
        void mo338j(int r1);

        /* renamed from: k */
        android.support.v4.media.session.MediaSessionCompat.AbstractC0161a mo339k();

        /* renamed from: l */
        void mo340l(p031c1.C0849q r1);

        /* renamed from: m */
        void mo341m(android.support.v4.media.MediaMetadataCompat r1);

        /* renamed from: n */
        android.support.v4.media.session.PlaybackStateCompat mo342n();

        /* renamed from: o */
        p031c1.C0849q mo343o();

        /* renamed from: q */
        void mo344q(int r1);

        void release();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public static class C0163c implements android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b {

        /* renamed from: a */
        public final android.media.session.MediaSession f541a;

        /* renamed from: b */
        public final android.support.v4.media.session.MediaSessionCompat.Token f542b;

        /* renamed from: c */
        public final java.lang.Object f543c;

        /* renamed from: d */
        public android.os.Bundle f544d;

        /* renamed from: e */
        public boolean f545e;

        /* renamed from: f */
        public final android.os.RemoteCallbackList<android.support.v4.media.session.InterfaceC0174a> f546f;

        /* renamed from: g */
        public android.support.v4.media.session.PlaybackStateCompat f547g;

        /* renamed from: h */
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> f548h;

        /* renamed from: i */
        public android.support.v4.media.MediaMetadataCompat f549i;

        /* renamed from: j */
        public int f550j;

        /* renamed from: k */
        public int f551k;

        /* renamed from: l */
        public android.support.v4.media.session.MediaSessionCompat.AbstractC0161a f552l;

        /* renamed from: m */
        public p031c1.C0849q f553m;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$c$a */
        public class a extends android.support.v4.media.session.InterfaceC0175b.a {

            /* renamed from: b */
            public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.C0163c f554b;

            public a(android.support.v4.media.session.MediaSessionCompat.C0163c r1) {
                    r0 = this;
                    r0.f554b = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: A */
            public int mo348A() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r1.f554b
                    int r0 = r0.f550j
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: A0 */
            public android.app.PendingIntent mo349A0() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: A1 */
            public void mo350A1(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: B0 */
            public int mo351B0() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r1.f554b
                    int r0 = r0.f551k
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: C0 */
            public void mo352C0(int r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: C1 */
            public android.support.v4.media.session.ParcelableVolumeInfo mo353C1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: D0 */
            public int mo354D0() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r1.f554b
                    java.util.Objects.requireNonNull(r0)
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: E1 */
            public void mo355E1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: F */
            public void mo356F(int r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: F1 */
            public android.os.Bundle mo357F1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: H0 */
            public void mo358H0(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: H1 */
            public void mo359H1(android.net.Uri r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: J0 */
            public boolean mo360J0() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r1.f554b
                    java.util.Objects.requireNonNull(r0)
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: L1 */
            public void mo361L1(long r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: Q */
            public void mo362Q(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: R */
            public void mo363R(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: T1 */
            public java.lang.String mo364T1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: W */
            public void mo365W(android.support.v4.media.session.InterfaceC0174a r5) {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r4.f554b
                    boolean r0 = r0.f545e
                    if (r0 != 0) goto L1c
                    c1.q r0 = new c1.q
                    int r1 = android.os.Binder.getCallingPid()
                    int r2 = android.os.Binder.getCallingUid()
                    java.lang.String r3 = "android.media.session.MediaController"
                    r0.<init>(r3, r1, r2)
                    android.support.v4.media.session.MediaSessionCompat$c r1 = r4.f554b
                    android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r1.f546f
                    r1.register(r5, r0)
                L1c:
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: X */
            public void mo366X(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: Z0 */
            public void mo367Z0(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: a0 */
            public void mo368a0(android.support.v4.media.MediaDescriptionCompat r1, int r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: a1 */
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mo369a1() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: d0 */
            public boolean mo370d0() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: e0 */
            public void mo371e0(boolean r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: e1 */
            public void mo372e1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: e2 */
            public void mo373e2(float r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: f0 */
            public void mo374f0(android.support.v4.media.RatingCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: g1 */
            public java.lang.CharSequence mo375g1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: j */
            public void mo376j() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: j2 */
            public boolean mo377j2(android.view.KeyEvent r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: k0 */
            public void mo378k0(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: k1 */
            public android.support.v4.media.MediaMetadataCompat mo379k1() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: l0 */
            public void mo380l0(android.net.Uri r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: l1 */
            public void mo381l1(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: m */
            public java.lang.String mo382m() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: m1 */
            public android.os.Bundle mo383m1() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.f554b
                    android.os.Bundle r0 = r0.f544d
                    if (r0 != 0) goto L8
                    r0 = 0
                    goto L11
                L8:
                    android.os.Bundle r0 = new android.os.Bundle
                    android.support.v4.media.session.MediaSessionCompat$c r1 = r2.f554b
                    android.os.Bundle r1 = r1.f544d
                    r0.<init>(r1)
                L11:
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: n */
            public android.support.v4.media.session.PlaybackStateCompat mo384n() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r2.f554b
                    android.support.v4.media.session.PlaybackStateCompat r1 = r0.f547g
                    android.support.v4.media.MediaMetadataCompat r0 = r0.f549i
                    android.support.v4.media.session.PlaybackStateCompat r0 = android.support.v4.media.session.MediaSessionCompat.m284c(r1, r0)
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: n1 */
            public void mo385n1(android.support.v4.media.session.InterfaceC0174a r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r1.f554b
                    android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r0.f546f
                    r0.unregister(r2)
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void next() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: o */
            public void mo386o() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: p */
            public void mo387p() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void previous() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: q */
            public void mo388q(int r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void stop() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: t0 */
            public void mo389t0(android.support.v4.media.MediaDescriptionCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: u0 */
            public boolean mo390u0() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: u1 */
            public void mo391u1(java.lang.String r1, android.os.Bundle r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: x0 */
            public void mo392x0(android.support.v4.media.MediaDescriptionCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: y1 */
            public void mo393y1(long r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: z */
            public long mo394z() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: z1 */
            public void mo395z1(boolean r1) {
                    r0 = this;
                    return
            }
        }

        public C0163c(android.content.Context r3, java.lang.String r4, p367v1.InterfaceC6491e r5, android.os.Bundle r6) {
                r2 = this;
                r2.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r2.f543c = r0
                r0 = 0
                r2.f545e = r0
                android.os.RemoteCallbackList r0 = new android.os.RemoteCallbackList
                r0.<init>()
                r2.f546f = r0
                android.media.session.MediaSession r3 = r2.mo345p(r3, r4, r6)
                r2.f541a = r3
                android.support.v4.media.session.MediaSessionCompat$Token r4 = new android.support.v4.media.session.MediaSessionCompat$Token
                android.media.session.MediaSession$Token r0 = r3.getSessionToken()
                android.support.v4.media.session.MediaSessionCompat$c$a r1 = new android.support.v4.media.session.MediaSessionCompat$c$a
                r1.<init>(r2)
                r4.<init>(r0, r1, r5)
                r2.f542b = r4
                r2.f544d = r6
                r4 = 3
                r3.setFlags(r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: F */
        public void mo328F(int r3) {
                r2 = this;
                int r0 = r2.f551k
                if (r0 == r3) goto L23
                r2.f551k = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r2.f546f
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r2.f546f
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.InterfaceC0174a) r1
                r1.mo280Q0(r3)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r2.f546f
                r3.finishBroadcast()
            L23:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public void mo329a(int r2) {
                r1 = this;
                android.media.session.MediaSession r0 = r1.f541a
                r2 = r2 | 1
                r2 = r2 | 2
                r0.setFlags(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: b */
        public void mo330b(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r6) {
                r5 = this;
                r5.f548h = r6
                if (r6 != 0) goto Lb
                android.media.session.MediaSession r6 = r5.f541a
                r0 = 0
            L7:
                r6.setQueue(r0)
                return
            Lb:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r6 = r6.iterator()
            L14:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r6.next()
                android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1
                android.media.session.MediaSession$QueueItem r2 = r1.f528a0
                if (r2 != 0) goto L34
                android.support.v4.media.MediaDescriptionCompat r2 = r1.f526Y
                java.lang.Object r2 = r2.m208b()
                android.media.MediaDescription r2 = (android.media.MediaDescription) r2
                long r3 = r1.f527Z
                android.media.session.MediaSession$QueueItem r2 = android.support.v4.media.session.MediaSessionCompat.QueueItem.C0158b.m291a(r2, r3)
                r1.f528a0 = r2
            L34:
                r0.add(r2)
                goto L14
            L38:
                android.media.session.MediaSession r6 = r5.f541a
                goto L7
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: c */
        public void mo331c(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 >= r1) goto L23
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r2.f546f
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r2.f546f
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.InterfaceC0174a) r1
                r1.mo279G(r3, r4)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r2.f546f
                r0.finishBroadcast()
            L23:
                android.media.session.MediaSession r0 = r2.f541a
                r0.sendSessionEvent(r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: d */
        public void mo332d(boolean r2) {
                r1 = this;
                android.media.session.MediaSession r0 = r1.f541a
                r0.setActive(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: e */
        public android.support.v4.media.session.MediaSessionCompat.Token mo333e() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.f542b
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: f */
        public void mo334f(android.app.PendingIntent r2) {
                r1 = this;
                android.media.session.MediaSession r0 = r1.f541a
                r0.setSessionActivity(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: g */
        public void mo335g(android.support.v4.media.session.PlaybackStateCompat r10) {
                r9 = this;
                r9.f547g = r10
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r9.f546f
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            La:
                if (r0 < 0) goto L1a
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r9.f546f
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.InterfaceC0174a) r1
                r1.mo281Z1(r10)     // Catch: android.os.RemoteException -> L17
            L17:
                int r0 = r0 + (-1)
                goto La
            L1a:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r9.f546f
                r0.finishBroadcast()
                android.media.session.MediaSession r0 = r9.f541a
                if (r10 != 0) goto L25
                r10 = 0
                goto L8d
            L25:
                android.media.session.PlaybackState r1 = r10.f575j0
                if (r1 != 0) goto L8b
                android.media.session.PlaybackState$Builder r1 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m402d()
                int r3 = r10.f564Y
                long r4 = r10.f565Z
                float r6 = r10.f567b0
                long r7 = r10.f571f0
                r2 = r1
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m422x(r2, r3, r4, r6, r7)
                long r2 = r10.f566a0
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m419u(r1, r2)
                long r2 = r10.f568c0
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m417s(r1, r2)
                java.lang.CharSequence r2 = r10.f570e0
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m420v(r1, r2)
                java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r2 = r10.f572g0
                java.util.Iterator r2 = r2.iterator()
            L4e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L75
                java.lang.Object r3 = r2.next()
                android.support.v4.media.session.PlaybackStateCompat$CustomAction r3 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r3
                android.media.session.PlaybackState$CustomAction r4 = r3.f580c0
                if (r4 != 0) goto L71
                java.lang.String r4 = r3.f576Y
                java.lang.CharSequence r5 = r3.f577Z
                int r6 = r3.f578a0
                android.media.session.PlaybackState$CustomAction$Builder r4 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m403e(r4, r5, r6)
                android.os.Bundle r3 = r3.f579b0
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m421w(r4, r3)
                android.media.session.PlaybackState$CustomAction r4 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m400b(r4)
            L71:
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m399a(r1, r4)
                goto L4e
            L75:
                long r2 = r10.f573h0
                android.support.v4.media.session.PlaybackStateCompat.C0172b.m418t(r1, r2)
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 22
                if (r2 < r3) goto L85
                android.os.Bundle r2 = r10.f574i0
                android.support.v4.media.session.PlaybackStateCompat.C0173c.m424b(r1, r2)
            L85:
                android.media.session.PlaybackState r1 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m401c(r1)
                r10.f575j0 = r1
            L8b:
                android.media.session.PlaybackState r10 = r10.f575j0
            L8d:
                r0.setPlaybackState(r10)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: h */
        public void mo336h(android.support.v4.media.session.MediaSessionCompat.AbstractC0161a r4, android.os.Handler r5) {
                r3 = this;
                java.lang.Object r0 = r3.f543c
                monitor-enter(r0)
                r3.f552l = r4     // Catch: java.lang.Throwable -> L17
                android.media.session.MediaSession r1 = r3.f541a     // Catch: java.lang.Throwable -> L17
                if (r4 != 0) goto Lb
                r2 = 0
                goto Ld
            Lb:
                android.media.session.MediaSession$Callback r2 = r4.f535Z     // Catch: java.lang.Throwable -> L17
            Ld:
                r1.setCallback(r2, r5)     // Catch: java.lang.Throwable -> L17
                if (r4 == 0) goto L15
                r4.m314g0(r3, r5)     // Catch: java.lang.Throwable -> L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                throw r4
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: i */
        public void mo337i(p031c1.AbstractC0852t r2) {
                r1 = this;
                android.media.session.MediaSession r0 = r1.f541a
                java.lang.Object r2 = r2.m2518a()
                android.media.VolumeProvider r2 = (android.media.VolumeProvider) r2
                r0.setPlaybackToRemote(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: j */
        public void mo338j(int r2) {
                r1 = this;
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r0.setLegacyStreamType(r2)
                android.media.session.MediaSession r2 = r1.f541a
                android.media.AudioAttributes r0 = r0.build()
                r2.setPlaybackToLocal(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: k */
        public android.support.v4.media.session.MediaSessionCompat.AbstractC0161a mo339k() {
                r2 = this;
                java.lang.Object r0 = r2.f543c
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$a r1 = r2.f552l     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: l */
        public void mo340l(p031c1.C0849q r2) {
                r1 = this;
                java.lang.Object r0 = r1.f543c
                monitor-enter(r0)
                r1.f553m = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: m */
        public void mo341m(android.support.v4.media.MediaMetadataCompat r4) {
                r3 = this;
                r3.f549i = r4
                android.media.session.MediaSession r0 = r3.f541a
                if (r4 != 0) goto L8
                r4 = 0
                goto L28
            L8:
                android.media.MediaMetadata r1 = r4.f499Z
                if (r1 != 0) goto L26
                android.os.Parcel r1 = android.os.Parcel.obtain()
                android.os.Bundle r2 = r4.f498Y
                r1.writeBundle(r2)
                r2 = 0
                r1.setDataPosition(r2)
                android.os.Parcelable$Creator r2 = android.media.MediaMetadata.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r1)
                android.media.MediaMetadata r2 = (android.media.MediaMetadata) r2
                r4.f499Z = r2
                r1.recycle()
            L26:
                android.media.MediaMetadata r4 = r4.f499Z
            L28:
                r0.setMetadata(r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: n */
        public android.support.v4.media.session.PlaybackStateCompat mo342n() {
                r1 = this;
                android.support.v4.media.session.PlaybackStateCompat r0 = r1.f547g
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: o */
        public p031c1.C0849q mo343o() {
                r2 = this;
                java.lang.Object r0 = r2.f543c
                monitor-enter(r0)
                c1.q r1 = r2.f553m     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        /* renamed from: p */
        public android.media.session.MediaSession mo345p(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                android.media.session.MediaSession r3 = new android.media.session.MediaSession
                r3.<init>(r1, r2)
                return r3
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: q */
        public void mo344q(int r3) {
                r2 = this;
                int r0 = r2.f550j
                if (r0 == r3) goto L23
                r2.f550j = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r2.f546f
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r2.f546f
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.InterfaceC0174a) r1
                r1.mo282u(r3)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r2.f546f
                r3.finishBroadcast()
            L23:
                return
        }

        /* renamed from: r */
        public java.lang.String m346r() {
                r5 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 24
                if (r0 >= r2) goto L8
                return r1
            L8:
                android.media.session.MediaSession r0 = r5.f541a     // Catch: java.lang.Exception -> L22
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L22
                java.lang.String r2 = "getCallingPackage"
                r3 = 0
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L22
                java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Exception -> L22
                android.media.session.MediaSession r2 = r5.f541a     // Catch: java.lang.Exception -> L22
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L22
                java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Exception -> L22
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L22
                return r0
            L22:
                r0 = move-exception
                java.lang.String r2 = "MediaSessionCompat"
                java.lang.String r3 = "Cannot execute MediaSession.getCallingPackage()"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        public void release() {
                r4 = this;
                r0 = 1
                r4.f545e = r0
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r4.f546f
                r1.kill()
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 0
                r3 = 27
                if (r1 != r3) goto L34
                android.media.session.MediaSession r1 = r4.f541a     // Catch: java.lang.Exception -> L2c
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L2c
                java.lang.String r3 = "mCallback"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Exception -> L2c
                r1.setAccessible(r0)     // Catch: java.lang.Exception -> L2c
                android.media.session.MediaSession r0 = r4.f541a     // Catch: java.lang.Exception -> L2c
                java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L2c
                android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.Exception -> L2c
                if (r0 == 0) goto L34
                r0.removeCallbacksAndMessages(r2)     // Catch: java.lang.Exception -> L2c
                goto L34
            L2c:
                r0 = move-exception
                java.lang.String r1 = "MediaSessionCompat"
                java.lang.String r3 = "Exception happened while accessing MediaSession.mCallback."
                android.util.Log.w(r1, r3, r0)
            L34:
                android.media.session.MediaSession r0 = r4.f541a
                r0.setCallback(r2)
                android.media.session.MediaSession r0 = r4.f541a
                r0.release()
                return
        }

        /* renamed from: s */
        public void m347s(android.app.PendingIntent r2) {
                r1 = this;
                android.media.session.MediaSession r0 = r1.f541a
                r0.setMediaButtonReceiver(r2)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static class C0164d extends android.support.v4.media.session.MediaSessionCompat.C0163c {
        public C0164d(android.content.Context r1, java.lang.String r2, p367v1.InterfaceC6491e r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public static class C0165e extends android.support.v4.media.session.MediaSessionCompat.C0164d {
        public C0165e(android.content.Context r1, java.lang.String r2, p367v1.InterfaceC6491e r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0163c, android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: l */
        public void mo340l(p031c1.C0849q r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0163c, android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b
        /* renamed from: o */
        public final p031c1.C0849q mo343o() {
                r2 = this;
                android.media.session.MediaSession r0 = r2.f541a
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r0.getCurrentControllerInfo()
                c1.q r1 = new c1.q
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C0166f extends android.support.v4.media.session.MediaSessionCompat.C0165e {
        public C0166f(android.content.Context r1, java.lang.String r2, p367v1.InterfaceC6491e r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0163c
        /* renamed from: p */
        public android.media.session.MediaSession mo345p(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
                r1 = this;
                android.media.session.MediaSession r0 = new android.media.session.MediaSession
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public static class C0167g implements android.support.v4.media.session.MediaSessionCompat.InterfaceC0162b {

        /* renamed from: a */
        public int f555a;

        /* renamed from: b */
        public int f556b;

        /* renamed from: c */
        public p031c1.AbstractC0852t f557c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        public class a extends p031c1.AbstractC0852t.d {

            /* renamed from: a */
            public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.C0167g f558a;
        }

        /* renamed from: p */
        public void m396p(android.support.v4.media.session.ParcelableVolumeInfo r1) {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    public interface InterfaceC0168h {
        /* renamed from: a */
        void mo397a();
    }

    static {
            boolean r0 = p158j0.C3379a.m7754a()
            if (r0 == 0) goto L9
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto La
        L9:
            r0 = 0
        La:
            android.support.v4.media.session.MediaSessionCompat.f521d = r0
            return
    }

    public MediaSessionCompat(android.content.Context r7, java.lang.String r8, android.content.ComponentName r9, android.app.PendingIntent r10) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f525c = r0
            if (r7 == 0) goto Ldf
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Ld7
            r0 = 1
            r1 = 0
            java.lang.String r2 = "android.intent.action.MEDIA_BUTTON"
            r3 = 0
            if (r9 != 0) goto L5f
            int r9 = androidx.media.session.MediaButtonReceiver.f2583a
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r2)
            java.lang.String r4 = r7.getPackageName()
            r9.setPackage(r4)
            android.content.pm.PackageManager r4 = r7.getPackageManager()
            java.util.List r9 = r4.queryBroadcastReceivers(r9, r1)
            int r4 = r9.size()
            if (r4 != r0) goto L48
            java.lang.Object r9 = r9.get(r1)
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r9 = r9.activityInfo
            java.lang.String r5 = r9.packageName
            java.lang.String r9 = r9.name
            r4.<init>(r5, r9)
            r9 = r4
            goto L56
        L48:
            int r9 = r9.size()
            if (r9 <= r0) goto L55
            java.lang.String r9 = "MediaButtonReceiver"
            java.lang.String r4 = "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null."
            android.util.Log.w(r9, r4)
        L55:
            r9 = r3
        L56:
            if (r9 != 0) goto L5f
            java.lang.String r4 = "MediaSessionCompat"
            java.lang.String r5 = "Couldn't find a unique registered media button receiver in the given context."
            android.util.Log.w(r4, r5)
        L5f:
            if (r9 == 0) goto L71
            if (r10 != 0) goto L71
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r2)
            r10.setComponent(r9)
            int r9 = android.support.v4.media.session.MediaSessionCompat.f521d
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r7, r1, r10, r9)
        L71:
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r9 < r1) goto L7d
            android.support.v4.media.session.MediaSessionCompat$f r9 = new android.support.v4.media.session.MediaSessionCompat$f
            r9.<init>(r7, r8, r3, r3)
            goto L96
        L7d:
            r1 = 28
            if (r9 < r1) goto L87
            android.support.v4.media.session.MediaSessionCompat$e r9 = new android.support.v4.media.session.MediaSessionCompat$e
            r9.<init>(r7, r8, r3, r3)
            goto L96
        L87:
            r1 = 22
            if (r9 < r1) goto L91
            android.support.v4.media.session.MediaSessionCompat$d r9 = new android.support.v4.media.session.MediaSessionCompat$d
            r9.<init>(r7, r8, r3, r3)
            goto L96
        L91:
            android.support.v4.media.session.MediaSessionCompat$c r9 = new android.support.v4.media.session.MediaSessionCompat$c
            r9.<init>(r7, r8, r3, r3)
        L96:
            r6.f523a = r9
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 == 0) goto La5
            android.os.Looper r1 = android.os.Looper.myLooper()
            goto La9
        La5:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
        La9:
            r8.<init>(r1)
            android.support.v4.media.session.c r1 = new android.support.v4.media.session.c
            r1.<init>(r6)
            r6.m288e(r1, r8)
            r9.m347s(r10)
            android.support.v4.media.session.MediaControllerCompat r8 = new android.support.v4.media.session.MediaControllerCompat
            r8.<init>(r7, r6)
            r6.f524b = r8
            int r8 = android.support.v4.media.session.MediaSessionCompat.f522e
            if (r8 != 0) goto Ld6
            r8 = 1134559232(0x43a00000, float:320.0)
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r0, r8, r7)
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            android.support.v4.media.session.MediaSessionCompat.f522e = r7
        Ld6:
            return
        Ld7:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "tag must not be null or empty"
            r7.<init>(r8)
            throw r7
        Ldf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "context must not be null"
            r7.<init>(r8)
            throw r7
    }

    /* renamed from: a */
    public static void m283a(android.os.Bundle r1) {
            if (r1 == 0) goto Lb
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setClassLoader(r0)
        Lb:
            return
    }

    /* renamed from: c */
    public static android.support.v4.media.session.PlaybackStateCompat m284c(android.support.v4.media.session.PlaybackStateCompat r26, android.support.v4.media.MediaMetadataCompat r27) {
            r0 = r26
            r1 = r27
            if (r0 == 0) goto L83
            long r2 = r0.f565Z
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L83
        L10:
            int r2 = r0.f564Y
            r3 = 3
            if (r2 == r3) goto L1b
            r3 = 4
            if (r2 == r3) goto L1b
            r3 = 5
            if (r2 != r3) goto L83
        L1b:
            long r2 = r0.f571f0
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L83
            long r20 = android.os.SystemClock.elapsedRealtime()
            float r8 = r0.f567b0
            long r2 = r20 - r2
            float r2 = (float) r2
            float r8 = r8 * r2
            long r2 = (long) r8
            long r8 = r0.f565Z
            long r2 = r2 + r8
            if (r1 == 0) goto L44
            android.os.Bundle r8 = r1.f498Y
            java.lang.String r9 = "android.media.metadata.DURATION"
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L44
            android.os.Bundle r1 = r1.f498Y
            long r4 = r1.getLong(r9, r6)
        L44:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L4e
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L4e
            r11 = r4
            goto L55
        L4e:
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 >= 0) goto L54
            r11 = r6
            goto L55
        L54:
            r11 = r2
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            long r13 = r0.f566a0
            long r2 = r0.f568c0
            int r4 = r0.f569d0
            java.lang.CharSequence r5 = r0.f570e0
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r6 = r0.f572g0
            if (r6 == 0) goto L69
            r1.addAll(r6)
        L69:
            long r6 = r0.f573h0
            android.os.Bundle r8 = r0.f574i0
            int r10 = r0.f564Y
            float r15 = r0.f567b0
            android.support.v4.media.session.PlaybackStateCompat r0 = new android.support.v4.media.session.PlaybackStateCompat
            r9 = r0
            r16 = r2
            r18 = r4
            r19 = r5
            r22 = r1
            r23 = r6
            r25 = r8
            r9.<init>(r10, r11, r13, r15, r16, r18, r19, r20, r22, r23, r25)
        L83:
            return r0
    }

    /* renamed from: g */
    public static android.os.Bundle m285g(android.os.Bundle r1) {
            m283a(r1)
            r1.isEmpty()     // Catch: android.os.BadParcelableException -> L7
            return r1
        L7:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r0 = "Could not unparcel the data."
            android.util.Log.e(r1, r0)
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public android.support.v4.media.session.MediaSessionCompat.Token m286b() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$b r0 = r1.f523a
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.mo333e()
            return r0
    }

    /* renamed from: d */
    public void m287d(boolean r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$b r0 = r1.f523a
            r0.mo332d(r2)
            java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat$h> r2 = r1.f525c
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            android.support.v4.media.session.MediaSessionCompat$h r0 = (android.support.v4.media.session.MediaSessionCompat.InterfaceC0168h) r0
            r0.mo397a()
            goto Lb
        L1b:
            return
    }

    /* renamed from: e */
    public void m288e(android.support.v4.media.session.MediaSessionCompat.AbstractC0161a r2, android.os.Handler r3) {
            r1 = this;
            if (r2 != 0) goto L9
            android.support.v4.media.session.MediaSessionCompat$b r2 = r1.f523a
            r3 = 0
            r2.mo336h(r3, r3)
            goto L16
        L9:
            android.support.v4.media.session.MediaSessionCompat$b r0 = r1.f523a
            if (r3 == 0) goto Le
            goto L13
        Le:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
        L13:
            r0.mo336h(r2, r3)
        L16:
            return
    }

    /* renamed from: f */
    public void m289f(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r7) {
            r6 = this;
            if (r7 == 0) goto L52
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2
            if (r2 == 0) goto L4a
            long r3 = r2.f527Z
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L40
            java.lang.String r3 = "Found duplicate queue id: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            long r4 = r2.f527Z
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "id of each queue item should be unique"
            r4.<init>(r5)
            java.lang.String r5 = "MediaSessionCompat"
            android.util.Log.e(r5, r3, r4)
        L40:
            long r2 = r2.f527Z
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r2)
            goto Lb
        L4a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "queue shouldn't have null items"
            r7.<init>(r0)
            throw r7
        L52:
            android.support.v4.media.session.MediaSessionCompat$b r0 = r6.f523a
            r0.mo330b(r7)
            return
    }
}
