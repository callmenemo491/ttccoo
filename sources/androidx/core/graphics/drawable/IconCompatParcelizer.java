package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(p367v1.AbstractC6489c r5) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f1956a
            r2 = 1
            int r1 = r5.m13193k(r1, r2)
            r0.f1956a = r1
            byte[] r1 = r0.f1958c
            r2 = 2
            boolean r3 = r5.mo13191i(r2)
            if (r3 != 0) goto L18
            goto L1c
        L18:
            byte[] r1 = r5.mo13189g()
        L1c:
            r0.f1958c = r1
            android.os.Parcelable r1 = r0.f1959d
            r3 = 3
            android.os.Parcelable r1 = r5.m13195m(r1, r3)
            r0.f1959d = r1
            int r1 = r0.f1960e
            r4 = 4
            int r1 = r5.m13193k(r1, r4)
            r0.f1960e = r1
            int r1 = r0.f1961f
            r4 = 5
            int r1 = r5.m13193k(r1, r4)
            r0.f1961f = r1
            android.content.res.ColorStateList r1 = r0.f1962g
            r4 = 6
            android.os.Parcelable r1 = r5.m13195m(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f1962g = r1
            java.lang.String r1 = r0.f1964i
            r4 = 7
            boolean r4 = r5.mo13191i(r4)
            if (r4 != 0) goto L4e
            goto L52
        L4e:
            java.lang.String r1 = r5.mo13196n()
        L52:
            r0.f1964i = r1
            java.lang.String r1 = r0.f1965j
            r4 = 8
            boolean r4 = r5.mo13191i(r4)
            if (r4 != 0) goto L5f
            goto L63
        L5f:
            java.lang.String r1 = r5.mo13196n()
        L63:
            r0.f1965j = r1
            java.lang.String r5 = r0.f1964i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f1963h = r5
            int r5 = r0.f1956a
            r1 = 0
            switch(r5) {
                case -1: goto Lad;
                case 0: goto L73;
                case 1: goto L9c;
                case 2: goto L79;
                case 3: goto L74;
                case 4: goto L79;
                case 5: goto L9c;
                case 6: goto L79;
                default: goto L73;
            }
        L73:
            goto Lbc
        L74:
            byte[] r5 = r0.f1958c
            r0.f1957b = r5
            goto Lbc
        L79:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f1958c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f1957b = r5
            int r3 = r0.f1956a
            if (r3 != r2) goto Lbc
            java.lang.String r2 = r0.f1965j
            if (r2 != 0) goto Lbc
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f1965j = r5
            goto Lbc
        L9c:
            android.os.Parcelable r5 = r0.f1959d
            if (r5 == 0) goto La1
            goto Lb1
        La1:
            byte[] r5 = r0.f1958c
            r0.f1957b = r5
            r0.f1956a = r3
            r0.f1960e = r1
            int r5 = r5.length
            r0.f1961f = r5
            goto Lbc
        Lad:
            android.os.Parcelable r5 = r0.f1959d
            if (r5 == 0) goto Lb4
        Lb1:
            r0.f1957b = r5
            goto Lbc
        Lb4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        Lbc:
            return r0
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r2, p367v1.AbstractC6489c r3) {
            java.util.Objects.requireNonNull(r3)
            android.graphics.PorterDuff$Mode r0 = r2.f1963h
            java.lang.String r0 = r0.name()
            r2.f1964i = r0
            int r0 = r2.f1956a
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L3a;
                case 0: goto L12;
                case 1: goto L3a;
                case 2: goto L2b;
                case 3: goto L24;
                case 4: goto L13;
                case 5: goto L3a;
                case 6: goto L13;
                default: goto L12;
            }
        L12:
            goto L40
        L13:
            java.lang.Object r0 = r2.f1957b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r2.f1958c = r0
            goto L40
        L24:
            java.lang.Object r0 = r2.f1957b
            byte[] r0 = (byte[]) r0
            r2.f1958c = r0
            goto L40
        L2b:
            java.lang.Object r0 = r2.f1957b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r2.f1958c = r0
            goto L40
        L3a:
            java.lang.Object r0 = r2.f1957b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.f1959d = r0
        L40:
            r0 = -1
            int r1 = r2.f1956a
            if (r0 == r1) goto L4c
            r0 = 1
            r3.mo13198p(r0)
            r3.mo13202t(r1)
        L4c:
            byte[] r0 = r2.f1958c
            if (r0 == 0) goto L57
            r1 = 2
            r3.mo13198p(r1)
            r3.mo13200r(r0)
        L57:
            android.os.Parcelable r0 = r2.f1959d
            if (r0 == 0) goto L62
            r1 = 3
            r3.mo13198p(r1)
            r3.mo13203u(r0)
        L62:
            int r0 = r2.f1960e
            if (r0 == 0) goto L6d
            r1 = 4
            r3.mo13198p(r1)
            r3.mo13202t(r0)
        L6d:
            int r0 = r2.f1961f
            if (r0 == 0) goto L78
            r1 = 5
            r3.mo13198p(r1)
            r3.mo13202t(r0)
        L78:
            android.content.res.ColorStateList r0 = r2.f1962g
            if (r0 == 0) goto L83
            r1 = 6
            r3.mo13198p(r1)
            r3.mo13203u(r0)
        L83:
            java.lang.String r0 = r2.f1964i
            if (r0 == 0) goto L8e
            r1 = 7
            r3.mo13198p(r1)
            r3.mo13204v(r0)
        L8e:
            java.lang.String r2 = r2.f1965j
            if (r2 == 0) goto L9a
            r0 = 8
            r3.mo13198p(r0)
            r3.mo13204v(r2)
        L9a:
            return
    }
}
