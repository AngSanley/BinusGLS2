/*
 * Copyright 2019 Andrew Cen.
 * Copyright 2019 Stanley. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.angsanley.binusgls2.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;

import com.angsanley.binusgls2.R;

public class Thumbnail {
    private Bitmap mBitmap;
    private String mTitle;
    private String mPath;
    private boolean mFolder;

    public Thumbnail(Bitmap bitmap, String title, String path) {
        mBitmap = bitmap;
        mTitle = title;
        mPath = path;
        mFolder = false;
    }

    public Thumbnail(String title, String path, Context context, int size) {
        mBitmap = ThumbnailUtils.extractThumbnail(BitmapFactory.decodeResource(context.getResources(), R.drawable.folder)
                , size, size);
        mTitle = title;
        mPath = path;
        mFolder = true;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isFolder() {
        return mFolder;
    }

    public void setFolder(boolean folder) {
        mFolder = folder;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }
}