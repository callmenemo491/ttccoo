package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = null;

    /* renamed from: Y */
    public final int f564Y;

    /* renamed from: Z */
    public final long f565Z;

    /* renamed from: a0 */
    public final long f566a0;

    /* renamed from: b0 */
    public final float f567b0;

    /* renamed from: c0 */
    public final long f568c0;

    /* renamed from: d0 */
    public final int f569d0;

    /* renamed from: e0 */
    public final java.lang.CharSequence f570e0;

    /* renamed from: f0 */
    public final long f571f0;

    /* renamed from: g0 */
    public java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> f572g0;

    /* renamed from: h0 */
    public final long f573h0;

    /* renamed from: i0 */
    public final android.os.Bundle f574i0;

    /* renamed from: j0 */
    public android.media.session.PlaybackState f575j0;

    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = null;

        /* renamed from: Y */
        public final java.lang.String f576Y;

        /* renamed from: Z */
        public final java.lang.CharSequence f577Z;

        /* renamed from: a0 */
        public final int f578a0;

        /* renamed from: b0 */
        public final android.os.Bundle f579b0;

        /* renamed from: c0 */
        public android.media.session.PlaybackState.CustomAction f580c0;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C0170a implements android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> {
            public C0170a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.PlaybackStateCompat.CustomAction createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.PlaybackStateCompat.CustomAction[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.media.session.PlaybackStateCompat$CustomAction[] r1 = new android.support.v4.media.session.PlaybackStateCompat.CustomAction[r1]
                    return r1
            }
        }

        static {
                android.support.v4.media.session.PlaybackStateCompat$CustomAction$a r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$a
                r0.<init>()
                android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR = r0
                return
        }

        public CustomAction(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.f576Y = r0
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r0 = r0.createFromParcel(r2)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.f577Z = r0
                int r0 = r2.readInt()
                r1.f578a0 = r0
                java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Bundle r2 = r2.readBundle(r0)
                r1.f579b0 = r2
                return
        }

        public CustomAction(java.lang.String r1, java.lang.CharSequence r2, int r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>()
                r0.f576Y = r1
                r0.f577Z = r2
                r0.f578a0 = r3
                r0.f579b0 = r4
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Action:mName='"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.CharSequence r1 = r2.f577Z
                r0.append(r1)
                java.lang.String r1 = ", mIcon="
                r0.append(r1)
                int r1 = r2.f578a0
                r0.append(r1)
                java.lang.String r1 = ", mExtras="
                r0.append(r1)
                android.os.Bundle r1 = r2.f579b0
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.f576Y
                r2.writeString(r0)
                java.lang.CharSequence r0 = r1.f577Z
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                int r3 = r1.f578a0
                r2.writeInt(r3)
                android.os.Bundle r3 = r1.f579b0
                r2.writeBundle(r3)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C0171a implements android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> {
        public C0171a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.PlaybackStateCompat createFromParcel(android.os.Parcel r2) {
                r1 = this;
                android.support.v4.media.session.PlaybackStateCompat r0 = new android.support.v4.media.session.PlaybackStateCompat
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.PlaybackStateCompat[] newArray(int r1) {
                r0 = this;
                android.support.v4.media.session.PlaybackStateCompat[] r1 = new android.support.v4.media.session.PlaybackStateCompat[r1]
                return r1
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static class C0172b {
        /* renamed from: a */
        public static void m399a(android.media.session.PlaybackState.Builder r0, android.media.session.PlaybackState.CustomAction r1) {
                r0.addCustomAction(r1)
                return
        }

        /* renamed from: b */
        public static android.media.session.PlaybackState.CustomAction m400b(android.media.session.PlaybackState.CustomAction.Builder r0) {
                android.media.session.PlaybackState$CustomAction r0 = r0.build()
                return r0
        }

        /* renamed from: c */
        public static android.media.session.PlaybackState m401c(android.media.session.PlaybackState.Builder r0) {
                android.media.session.PlaybackState r0 = r0.build()
                return r0
        }

        /* renamed from: d */
        public static android.media.session.PlaybackState.Builder m402d() {
                android.media.session.PlaybackState$Builder r0 = new android.media.session.PlaybackState$Builder
                r0.<init>()
                return r0
        }

        /* renamed from: e */
        public static android.media.session.PlaybackState.CustomAction.Builder m403e(java.lang.String r1, java.lang.CharSequence r2, int r3) {
                android.media.session.PlaybackState$CustomAction$Builder r0 = new android.media.session.PlaybackState$CustomAction$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        /* renamed from: f */
        public static java.lang.String m404f(android.media.session.PlaybackState.CustomAction r0) {
                java.lang.String r0 = r0.getAction()
                return r0
        }

        /* renamed from: g */
        public static long m405g(android.media.session.PlaybackState r2) {
                long r0 = r2.getActions()
                return r0
        }

        /* renamed from: h */
        public static long m406h(android.media.session.PlaybackState r2) {
                long r0 = r2.getActiveQueueItemId()
                return r0
        }

        /* renamed from: i */
        public static long m407i(android.media.session.PlaybackState r2) {
                long r0 = r2.getBufferedPosition()
                return r0
        }

        /* renamed from: j */
        public static java.util.List<android.media.session.PlaybackState.CustomAction> m408j(android.media.session.PlaybackState r0) {
                java.util.List r0 = r0.getCustomActions()
                return r0
        }

        /* renamed from: k */
        public static java.lang.CharSequence m409k(android.media.session.PlaybackState r0) {
                java.lang.CharSequence r0 = r0.getErrorMessage()
                return r0
        }

        /* renamed from: l */
        public static android.os.Bundle m410l(android.media.session.PlaybackState.CustomAction r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        /* renamed from: m */
        public static int m411m(android.media.session.PlaybackState.CustomAction r0) {
                int r0 = r0.getIcon()
                return r0
        }

        /* renamed from: n */
        public static long m412n(android.media.session.PlaybackState r2) {
                long r0 = r2.getLastPositionUpdateTime()
                return r0
        }

        /* renamed from: o */
        public static java.lang.CharSequence m413o(android.media.session.PlaybackState.CustomAction r0) {
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }

        /* renamed from: p */
        public static float m414p(android.media.session.PlaybackState r0) {
                float r0 = r0.getPlaybackSpeed()
                return r0
        }

        /* renamed from: q */
        public static long m415q(android.media.session.PlaybackState r2) {
                long r0 = r2.getPosition()
                return r0
        }

        /* renamed from: r */
        public static int m416r(android.media.session.PlaybackState r0) {
                int r0 = r0.getState()
                return r0
        }

        /* renamed from: s */
        public static void m417s(android.media.session.PlaybackState.Builder r0, long r1) {
                r0.setActions(r1)
                return
        }

        /* renamed from: t */
        public static void m418t(android.media.session.PlaybackState.Builder r0, long r1) {
                r0.setActiveQueueItemId(r1)
                return
        }

        /* renamed from: u */
        public static void m419u(android.media.session.PlaybackState.Builder r0, long r1) {
                r0.setBufferedPosition(r1)
                return
        }

        /* renamed from: v */
        public static void m420v(android.media.session.PlaybackState.Builder r0, java.lang.CharSequence r1) {
                r0.setErrorMessage(r1)
                return
        }

        /* renamed from: w */
        public static void m421w(android.media.session.PlaybackState.CustomAction.Builder r0, android.os.Bundle r1) {
                r0.setExtras(r1)
                return
        }

        /* renamed from: x */
        public static void m422x(android.media.session.PlaybackState.Builder r0, int r1, long r2, float r4, long r5) {
                r0.setState(r1, r2, r4, r5)
                return
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static class C0173c {
        /* renamed from: a */
        public static android.os.Bundle m423a(android.media.session.PlaybackState r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        /* renamed from: b */
        public static void m424b(android.media.session.PlaybackState.Builder r0, android.os.Bundle r1) {
                r0.setExtras(r1)
                return
        }
    }

    static {
            android.support.v4.media.session.PlaybackStateCompat$a r0 = new android.support.v4.media.session.PlaybackStateCompat$a
            r0.<init>()
            android.support.v4.media.session.PlaybackStateCompat.CREATOR = r0
            return
    }

    public PlaybackStateCompat(int r4, long r5, long r7, float r9, long r10, int r12, java.lang.CharSequence r13, long r14, java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> r16, long r17, android.os.Bundle r19) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f564Y = r1
            r1 = r5
            r0.f565Z = r1
            r1 = r7
            r0.f566a0 = r1
            r1 = r9
            r0.f567b0 = r1
            r1 = r10
            r0.f568c0 = r1
            r1 = r12
            r0.f569d0 = r1
            r1 = r13
            r0.f570e0 = r1
            r1 = r14
            r0.f571f0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r16
            r1.<init>(r2)
            r0.f572g0 = r1
            r1 = r17
            r0.f573h0 = r1
            r1 = r19
            r0.f574i0 = r1
            return
    }

    public PlaybackStateCompat(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.f564Y = r0
            long r0 = r3.readLong()
            r2.f565Z = r0
            float r0 = r3.readFloat()
            r2.f567b0 = r0
            long r0 = r3.readLong()
            r2.f571f0 = r0
            long r0 = r3.readLong()
            r2.f566a0 = r0
            long r0 = r3.readLong()
            r2.f568c0 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.f570e0 = r0
            android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r0 = android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f572g0 = r0
            long r0 = r3.readLong()
            r2.f573h0 = r0
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r0 = r3.readBundle(r0)
            r2.f574i0 = r0
            int r3 = r3.readInt()
            r2.f569d0 = r3
            return
    }

    /* renamed from: a */
    public static android.support.v4.media.session.PlaybackStateCompat m398a(java.lang.Object r24) {
            r0 = 0
            if (r24 == 0) goto L86
            r1 = r24
            android.media.session.PlaybackState r1 = (android.media.session.PlaybackState) r1
            java.util.List r2 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m408j(r1)
            if (r2 == 0) goto L4b
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            if (r4 == 0) goto L43
            android.media.session.PlaybackState$CustomAction r4 = (android.media.session.PlaybackState.CustomAction) r4
            android.os.Bundle r5 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m410l(r4)
            android.support.v4.media.session.MediaSessionCompat.m283a(r5)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r6 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            java.lang.String r7 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m404f(r4)
            java.lang.CharSequence r8 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m413o(r4)
            int r9 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m411m(r4)
            r6.<init>(r7, r8, r9, r5)
            r6.f580c0 = r4
            goto L44
        L43:
            r6 = r0
        L44:
            r3.add(r6)
            goto L1a
        L48:
            r20 = r3
            goto L4d
        L4b:
            r20 = r0
        L4d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r2 < r3) goto L5a
            android.os.Bundle r0 = android.support.v4.media.session.PlaybackStateCompat.C0173c.m423a(r1)
            android.support.v4.media.session.MediaSessionCompat.m283a(r0)
        L5a:
            r23 = r0
            android.support.v4.media.session.PlaybackStateCompat r0 = new android.support.v4.media.session.PlaybackStateCompat
            r7 = r0
            int r8 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m416r(r1)
            long r9 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m415q(r1)
            long r11 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m407i(r1)
            float r13 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m414p(r1)
            long r14 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m405g(r1)
            r16 = 0
            java.lang.CharSequence r17 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m409k(r1)
            long r18 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m412n(r1)
            long r21 = android.support.v4.media.session.PlaybackStateCompat.C0172b.m406h(r1)
            r7.<init>(r8, r9, r11, r13, r14, r16, r17, r18, r20, r21, r23)
            r0.f575j0 = r1
        L86:
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlaybackState {"
            r0.<init>(r1)
            java.lang.String r1 = "state="
            r0.append(r1)
            int r1 = r3.f564Y
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f565Z
            r0.append(r1)
            java.lang.String r1 = ", buffered position="
            r0.append(r1)
            long r1 = r3.f566a0
            r0.append(r1)
            java.lang.String r1 = ", speed="
            r0.append(r1)
            float r1 = r3.f567b0
            r0.append(r1)
            java.lang.String r1 = ", updated="
            r0.append(r1)
            long r1 = r3.f571f0
            r0.append(r1)
            java.lang.String r1 = ", actions="
            r0.append(r1)
            long r1 = r3.f568c0
            r0.append(r1)
            java.lang.String r1 = ", error code="
            r0.append(r1)
            int r1 = r3.f569d0
            r0.append(r1)
            java.lang.String r1 = ", error message="
            r0.append(r1)
            java.lang.CharSequence r1 = r3.f570e0
            r0.append(r1)
            java.lang.String r1 = ", custom actions="
            r0.append(r1)
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r1 = r3.f572g0
            r0.append(r1)
            java.lang.String r1 = ", active item id="
            r0.append(r1)
            long r1 = r3.f573h0
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r0 = r2.f564Y
            r3.writeInt(r0)
            long r0 = r2.f565Z
            r3.writeLong(r0)
            float r0 = r2.f567b0
            r3.writeFloat(r0)
            long r0 = r2.f571f0
            r3.writeLong(r0)
            long r0 = r2.f566a0
            r3.writeLong(r0)
            long r0 = r2.f568c0
            r3.writeLong(r0)
            java.lang.CharSequence r0 = r2.f570e0
            android.text.TextUtils.writeToParcel(r0, r3, r4)
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r4 = r2.f572g0
            r3.writeTypedList(r4)
            long r0 = r2.f573h0
            r3.writeLong(r0)
            android.os.Bundle r4 = r2.f574i0
            r3.writeBundle(r4)
            int r4 = r2.f569d0
            r3.writeInt(r4)
            return
    }
}
